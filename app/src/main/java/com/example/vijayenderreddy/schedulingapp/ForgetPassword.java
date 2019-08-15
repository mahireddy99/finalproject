package com.example.vijayenderreddy.schedulingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);
        TextView textView,textView1,textView2;
        EditText editText,editText1,editText2;
        Button submitbutton;

        textView= findViewById(R.id.frgtuser);
        textView1= findViewById(R.id.frgtpassword);
        textView2= findViewById(R.id.frgtconfigpawrd);

        editText= findViewById(R.id.frgtidedit);
        editText1= findViewById(R.id.frgpassedt);
        editText2= findViewById(R.id.confirmedt);


        submitbutton= findViewById(R.id.fgtpasshome);


    }
}