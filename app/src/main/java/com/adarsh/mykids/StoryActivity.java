package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.adarsh.mykids.Adapter.StoryAdapter;
import com.adarsh.mykids.Adapter.TofiveAdaper;
import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.StoryModel;
import com.adarsh.mykids.Retro.Model.TofiveModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        recyclerView=findViewById(R.id.storyrecycler);

        Api api= Api_client.ParentRegister().create(Api.class);
        api.STORY_MODEL_CALL().enqueue(new Callback<StoryModel>() {
            @Override
            public void onResponse(Call<StoryModel> call, Response<StoryModel> response) {
                StoryModel storyModel=response.body();
                if(storyModel.getStatus().equalsIgnoreCase("success"))
                {
                    GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    StoryAdapter tofiveAdaper=new StoryAdapter(getApplicationContext(),storyModel);
                    recyclerView.setAdapter(tofiveAdaper);
                }
            }

            @Override
            public void onFailure(Call<StoryModel> call, Throwable t) {

            }
        });


    }


}
