package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
    }

    public void tillfiveClick(View view) {
        Intent i=new Intent(EducationActivity.this,EducationRecyclerActivity.class);
        startActivity(i);
    }


    public void storyClick(View view) {
        Intent i=new Intent(EducationActivity.this,StoryActivity.class);
        startActivity(i);
    }

    public void scienceClick(View view) {
        Intent i=new Intent(EducationActivity.this,ScienceActivity.class);
        startActivity(i);
    }

    public void englishClick(View view) {
        Intent i=new Intent(EducationActivity.this,EnglishActivity.class);
        startActivity(i);
    }

    public void mathsClick(View view) {
        Intent i=new Intent(EducationActivity.this,MathsActivity.class);
        startActivity(i);
    }

    public void computerClick(View view) {
        Intent i=new Intent(EducationActivity.this,ComputerActivity.class);
        startActivity(i);
    }
}
