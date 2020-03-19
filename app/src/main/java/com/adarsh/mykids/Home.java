package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.adarsh.mykids.Adapter.ViewChildAdapter;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ViewChildModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView=findViewById(R.id.recyclerView);
        imageView=findViewById(R.id.img);

        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
        String string_id=sharedPreferences.getString("key1",null);
        Api api= Api_client.ParentRegister().create(Api.class);
        api.VIEW_CHILD_MODEL_CALL(string_id).enqueue(new Callback<ViewChildModel>() {
            @Override
            public void onResponse(Call<ViewChildModel> call, Response<ViewChildModel> response) {
                ViewChildModel viewChildModel=response.body();
                if(viewChildModel.getStatus().equalsIgnoreCase("fail"))
                {
                    imageView.setVisibility(View.VISIBLE);
                }
                else
                {
                    LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false);
                    recyclerView.setLayoutManager(linearLayoutManager);

                    ViewChildAdapter viewChildAdapter=new ViewChildAdapter(getApplicationContext(),viewChildModel);
                    recyclerView.setAdapter(viewChildAdapter);

                }
            }

            @Override
            public void onFailure(Call<ViewChildModel> call, Throwable t) {

            }
        });

    }

    public void fabClick(View view) {
        Intent i=new Intent(Home.this,AddChild.class);
        startActivity(i);
    }
}
