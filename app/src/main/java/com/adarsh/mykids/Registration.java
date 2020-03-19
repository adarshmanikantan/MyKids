package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.ParentRegistrationModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registration extends AppCompatActivity {

    EditText name,email,phone,password,confirm_pswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.regname);
        email = findViewById(R.id.regemail);
        phone = findViewById(R.id.regphone);
        password = findViewById(R.id.regpass);
        confirm_pswd = findViewById(R.id.regcpass);


    }

    public void parentSignUp(View view) {
        Api api = Api_client.ParentRegister().create(Api.class);
        if (name.getText().toString().equals("")) {
            Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
        }
        else if (email.getText().toString().equals("")) {
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();

        }
        else if (phone.getText().toString().equals("")) {
            Toast.makeText(this, "Enter phone number", Toast.LENGTH_SHORT).show();

        }
        else if (password.getText().toString().equals("")) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();

        }
        else if (confirm_pswd.getText().toString().equals("")) {
            Toast.makeText(this, "Confirm your password", Toast.LENGTH_SHORT).show();

        }
        else if (!password.getText().toString().equals(confirm_pswd.getText().toString())) {
            Toast.makeText(this, "Passwords dont match", Toast.LENGTH_SHORT).show();

        }
        else {
            api.PARENT_REGISTRATION_MODEL_CALL(name.getText().toString(), email.getText().toString(),
                    phone.getText().toString(), password.getText().toString()).enqueue(new Callback<ParentRegistrationModel>() {
                @Override
                public void onResponse(Call<ParentRegistrationModel> call, Response<ParentRegistrationModel> response) {
                    ParentRegistrationModel parentRegistrationModel = response.body();
                    if (parentRegistrationModel.getStatus().equalsIgnoreCase("success")) {
                        Toast.makeText(Registration.this, parentRegistrationModel.getStatus(), Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Registration.this, Login.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Registration.this, parentRegistrationModel.getStatus(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ParentRegistrationModel> call, Throwable t) {

                }
            });

        }
    }
}
