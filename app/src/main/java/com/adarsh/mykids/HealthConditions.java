package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.ComputerAdapter;
import com.adarsh.mykids.Adapter.HealthConditionsAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ComputerModel;
import com.adarsh.mykids.Retro.ViewHealthConditionsModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HealthConditions extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_conditions);

        recyclerView=findViewById(R.id.healthrecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.VIEW_HEALTH_CONDITIONS_MODEL_CALL().enqueue(new Callback<ViewHealthConditionsModel>() {
            @Override
            public void onResponse(Call<ViewHealthConditionsModel> call, Response<ViewHealthConditionsModel> response) {
                ViewHealthConditionsModel viewHealthConditionsModel=response.body();
                if(viewHealthConditionsModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    HealthConditionsAdapter healthConditionsAdapter=new HealthConditionsAdapter(getApplicationContext(),viewHealthConditionsModel);
                    recyclerView.setAdapter(healthConditionsAdapter);
                }
            }

            @Override
            public void onFailure(Call<ViewHealthConditionsModel> call, Throwable t) {

            }
        });


    }


}

