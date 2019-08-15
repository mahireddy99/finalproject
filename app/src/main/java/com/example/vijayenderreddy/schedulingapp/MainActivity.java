package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtview1,txtview2;
        EditText editview1,editview2;
        Button signbutton,forgetbutton;

        txtview1 = findViewById(R.id.user);
        txtview2= findViewById(R.id.password);
        editview1= findViewById(R.id.useredit);
        editview2= findViewById(R.id.passwordedit);
        signbutton= findViewById(R.id.signinbtn);
        forgetbutton= findViewById(R.id.frgpardbtn);

        signbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HomePage.class);
                startActivity(i);
            }
        });

        forgetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ForgetPassword.class);
                startActivity(i);
            }
        });



    }
}
