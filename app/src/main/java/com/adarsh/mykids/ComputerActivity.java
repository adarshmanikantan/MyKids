package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.ComputerAdapter;
import com.adarsh.mykids.Adapter.MathsAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ComputerModel;
import com.adarsh.mykids.Retro.Model.MathsModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComputerActivity extends AppCompatActivity {

     RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        recyclerView=findViewById(R.id.cmptr_recyclerview);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.COMPUTER_MODEL_CALL().enqueue(new Callback<ComputerModel>() {
            @Override
            public void onResponse(Call<ComputerModel> call, Response<ComputerModel> response) {
                ComputerModel computerModel=response.body();
                if(computerModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    ComputerAdapter computerAdapter=new ComputerAdapter(getApplicationContext(),computerModel);
                    recyclerView.setAdapter(computerAdapter);
                }
            }

            @Override
            public void onFailure(Call<ComputerModel> call, Throwable t) {

            }
        });


    }


}
