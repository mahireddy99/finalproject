package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_profile);
        TextView textView1,textView2,textView3,textView4,textView5;
        EditText editText1,editText2,editText3,editText4,editText5;
        Button submitbutton,createprohome;

        textView1= findViewById(R.id.fname);
        textView2= findViewById(R.id.lname);
        textView3= findViewById(R.id.phonetxt);
        textView4= findViewById(R.id.emailtxt);
        textView5= findViewById(R.id.desigtxt);

        editText1= findViewById(R.id.fnamedt);
        editText2= findViewById(R.id.fnamedt);
        editText3= findViewById(R.id.phoneedt);
        editText4= findViewById(R.id.emailedt);
        editText5= findViewById(R.id.desigedt);

        submitbutton= findViewById(R.id.submitbtn);
        createprohome= findViewById(R.id.cprohome);

        createprohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(CreateProfile.this,HomePage.class);
                startActivity(i);
            }
        });


    }
}