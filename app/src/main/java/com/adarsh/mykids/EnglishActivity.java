package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.EnglishAdapter;
import com.adarsh.mykids.Adapter.ScienceAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.EnglishModel;
import com.adarsh.mykids.Retro.Model.ScienceModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EnglishActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        recyclerView=findViewById(R.id.englishrecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.ENGLISH_MODEL_CALL().enqueue(new Callback<EnglishModel>() {
            @Override
            public void onResponse(Call<EnglishModel> call, Response<EnglishModel> response) {
                EnglishModel englishModel=response.body();
                if(englishModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    EnglishAdapter englishAdapter=new EnglishAdapter(getApplicationContext(),englishModel);
                    recyclerView.setAdapter(englishAdapter);
                }
            }

            @Override
            public void onFailure(Call<EnglishModel> call, Throwable t) {

            }
        });


    }


}
