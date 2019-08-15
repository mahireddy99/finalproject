package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentAppointments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_appointments);

        Button updatebutton,deletebutton,backbutton;

        updatebutton= findViewById(R.id.updatebtn);
        deletebutton= findViewById(R.id.deletebtn);
        backbutton = findViewById(R.id.capthome);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CurrentAppointments.this, HomePage.class);
                startActivity(i);
            }
        });
    }
}