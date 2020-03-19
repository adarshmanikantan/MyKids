package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adarsh.mykids.Adapter.MathsAdapter;
import com.adarsh.mykids.Adapter.ScienceAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.MathsModel;
import com.adarsh.mykids.Retro.Model.ScienceModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MathsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        recyclerView=findViewById(R.id.mathsrecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.MATHS_MODEL_CALL().enqueue(new Callback<MathsModel>() {
            @Override
            public void onResponse(Call<MathsModel> call, Response<MathsModel> response) {
                MathsModel mathsModel=response.body();
                if(mathsModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    MathsAdapter mathsAdapter=new MathsAdapter(getApplicationContext(),mathsModel);
                    recyclerView.setAdapter(mathsAdapter);
                }
            }

            @Override
            public void onFailure(Call<MathsModel> call, Throwable t) {

            }
        });


    }


}
