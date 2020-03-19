package com.adarsh.mykids;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AccountChooser extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_chooser);

        imageView=findViewById(R.id.imgview);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void parentClick(View view) {
        Intent i=new Intent(AccountChooser.this,Login.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(AccountChooser.this,
                        imageView,
                        ViewCompat.getTransitionName(imageView));
        startActivity(i, options.toBundle());
    }
}
