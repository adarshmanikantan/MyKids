package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.TofiveAdaper;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.TofiveModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EducationRecyclerActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_recycler);
        recyclerView=findViewById(R.id.videorecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.TOFIVE_MODEL_CALL().enqueue(new Callback<TofiveModel>() {
            @Override
            public void onResponse(Call<TofiveModel> call, Response<TofiveModel> response) {
                TofiveModel tofiveModel=response.body();
                if(tofiveModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    TofiveAdaper tofiveAdaper=new TofiveAdaper(getApplicationContext(),tofiveModel);
                    recyclerView.setAdapter(tofiveAdaper);
                }
            }

            @Override
            public void onFailure(Call<TofiveModel> call, Throwable t) {

            }
        });


    }
}
