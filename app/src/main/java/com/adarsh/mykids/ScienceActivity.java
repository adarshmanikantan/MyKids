package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.ScienceAdapter;
import com.adarsh.mykids.Adapter.StoryAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ScienceModel;
import com.adarsh.mykids.Retro.Model.StoryModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScienceActivity extends AppCompatActivity {

    RecyclerView sciencce_recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        sciencce_recyclerView=findViewById(R.id.sciencerecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.SCIENCE_MODEL_CALL().enqueue(new Callback<ScienceModel>() {
            @Override
            public void onResponse(Call<ScienceModel> call, Response<ScienceModel> response) {
                ScienceModel scienceModel=response.body();
                if(scienceModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    sciencce_recyclerView.setLayoutManager(gridLayoutManager);
                    ScienceAdapter scienceAdapter=new ScienceAdapter(getApplicationContext(),scienceModel);
                    sciencce_recyclerView.setAdapter(scienceAdapter);
                }
            }

            @Override
            public void onFailure(Call<ScienceModel> call, Throwable t) {

            }
        });


    }


}
