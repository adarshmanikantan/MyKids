package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.adarsh.mykids.Adapter.GrowthStageAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.GrowthStageModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HealthHome extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_home);
       recyclerView=findViewById(R.id.growthrecycler);

     Api api= Api_client.ParentRegister().create(Api.class);
     api.GROWTH_STAGE_MODEL_CALL().enqueue(new Callback<GrowthStageModel>() {
         @Override
         public void onResponse(Call<GrowthStageModel> call, Response<GrowthStageModel> response) {
             GrowthStageModel growthStageModel=response.body();
             LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false);
             recyclerView.setLayoutManager(linearLayoutManager);
             GrowthStageAdapter growthStageAdapter=new GrowthStageAdapter(getApplicationContext(),growthStageModel);
             recyclerView.setAdapter(growthStageAdapter);
         }

         @Override
         public void onFailure(Call<GrowthStageModel> call, Throwable t) {

         }
     });
    }

    public void vaccinationClick(View view) {
        Intent i=new Intent(HealthHome.this,VaccinationActivity.class);
        startActivity(i);
    }

    public void healthConditionsClick(View view) {
        Intent i=new Intent(HealthHome.this,HealthConditions.class);
        startActivity(i);
    }

    public void parentalTips(View view) {
        Intent i=new Intent(HealthHome.this,ParentTips.class);
        startActivity(i);
    }
}
