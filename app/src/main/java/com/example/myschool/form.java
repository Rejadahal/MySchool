package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText names =findViewById(R.id.names);
        EditText address= findViewById(R.id.address);
        EditText phoneno =findViewById(R.id.phoneno);
        EditText gender =findViewById(R.id.gender);

        RadioButton male =findViewById(R.id.male);
        RadioButton female= findViewById(R.id.female);
        RadioButton others= findViewById(R.id.other);

        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onclick(View view){
//                String Names =names .getText().toString().trim();
//                String Address = address.getText().toString().trim();
//                String phoneNo = phoneno.getText().toString().trim();
//+
//            }
//
//
//        }

    }
}