package com.adarsh.mykids;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.adarsh.mykids.Retro.Api;
import com.adarsh.mykids.Retro.Api_client;
import com.adarsh.mykids.Retro.Model.AddChildModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddChild extends AppCompatActivity {

    EditText name,dob;
    RadioGroup radioGroup;
    RadioButton genderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);

        name=findViewById(R.id.childname);
        dob=findViewById(R.id.childdob);
        radioGroup=findViewById(R.id.radiogroup);

        dob.setInputType(InputType.TYPE_NULL);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                DatePickerDialog picker = new DatePickerDialog(AddChild.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                dob.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
    }



    public void addChildClick(View view) {
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
        String string_id=sharedPreferences.getString("key1",null);
        String string_name=name.getText().toString();
        String string_dob=dob.getText().toString();
        int gender_id=radioGroup.getCheckedRadioButtonId();
        genderButton=findViewById(gender_id);
        String gender=genderButton.getText().toString();
        Api api= Api_client.ParentRegister().create(Api.class);
        api.ADD_CHILD_MODEL_CALL(string_id,string_name,string_dob,gender,"1").
                enqueue(new Callback<AddChildModel>() {
                    @Override
                    public void onResponse(Call<AddChildModel> call, Response<AddChildModel> response) {
                        AddChildModel addChildModel=response.body();
                        if(addChildModel.getStatus().equalsIgnoreCase("success"))
                        {
                            Toast.makeText(AddChild.this, "Successfully added", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(AddChild.this,Home.class);
                            startActivity(i);
                        }
                    }

                    @Override
                    public void onFailure(Call<AddChildModel> call, Throwable t) {

                    }
                });
    }
}
