package com.adarsh.mykids;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChildHome extends AppCompatActivity {

    LinearLayout linearLayout;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_home);


        linearLayout=findViewById(R.id.linearlayout);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void childHealthClick(View view) {
        Intent intent = new Intent(ChildHome.this, HealthHome.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(ChildHome.this,
                        linearLayout,
                        ViewCompat.getTransitionName(linearLayout));
        startActivity(intent, options.toBundle());
    }

    public void childeduClick(View view) {
        Intent i=new Intent(ChildHome.this,EducationActivity.class);
        startActivity(i);
    }
}
