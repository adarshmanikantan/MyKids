package com.adarsh.mykids;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    ImageView imageView;
    ImageView parent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     imageView=findViewById(R.id.img);
     parent=findViewById(R.id.parentt);
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animationsample);

        imageView.startAnimation(animation);
            new Handler().postDelayed(new Runnable() {

                /*
                 * Showing splash screen with a timer. This will be useful when you
                 * want to show case your app logo / company
                 */

                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    Intent i=new Intent(MainActivity.this,Login.class);
                    ActivityOptionsCompat options = ActivityOptionsCompat.
                            makeSceneTransitionAnimation(MainActivity.this,
                                    parent,
                                    ViewCompat.getTransitionName(parent));
                    startActivity(i, options.toBundle());

                    // close this activity
                    finish();
                }
            }, SPLASH_TIME_OUT);


        }
    }
