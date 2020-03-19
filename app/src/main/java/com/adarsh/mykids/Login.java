package com.adarsh.mykids;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUtils;
import android.os.RecoverySystem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ParentLoginModel;
import com.dd.processbutton.iml.SubmitProcessButton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    EditText phone, password;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phone = findViewById(R.id.login_phone);
        password = findViewById(R.id.login_pswd);
        signup=findViewById(R.id.signuptext);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void signUpclick(View view) {

        Intent intent = new Intent(Login.this, Registration.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(Login.this,signup,
                        ViewCompat.getTransitionName(signup));
        startActivity(intent, options.toBundle());
    }

    public void loginClick(View view) {

        if (phone.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter Phone number", Toast.LENGTH_SHORT).show();
        }
        else if (password.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        }
        else {
            Api api = Api_client.ParentRegister().create(Api.class);
            api.PARENT_LOGIN_MODEL_CALL(phone.getText().toString(), password.getText().toString())
                    .enqueue(new Callback<ParentLoginModel>() {
                        @Override
                        public void onResponse(Call<ParentLoginModel> call, Response<ParentLoginModel> response) {
                            ParentLoginModel parentLoginModel = response.body();
                            if (parentLoginModel.getStatus().equalsIgnoreCase("Success")) {
                                Toast.makeText(Login.this, parentLoginModel.getStatus(), Toast.LENGTH_SHORT).show();
                                String string_id=parentLoginModel.getUser_data().getId();
                                String string_email=parentLoginModel.getUser_data().getEmail();

                                SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
                                SharedPreferences.Editor editor=sharedPreferences.edit();
                                editor.putString("key1",string_id);
                                editor.putString("key2",string_email);
                                editor.apply();
                                Intent i = new Intent(Login.this, Home.class);
                                startActivity(i);
                            }
                        }
                        @Override
                        public void onFailure(Call<ParentLoginModel> call, Throwable t) {
                            Toast.makeText(Login.this,"Login Failed", Toast.LENGTH_SHORT).show();
                        }
                    });

        }
    }
}