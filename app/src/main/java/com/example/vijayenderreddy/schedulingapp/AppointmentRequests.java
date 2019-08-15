package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppointmentRequests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_request);

        Button acceptedbutton, rejectedbutton,appointrequesthome;

        acceptedbutton = findViewById(R.id.acceptbtn);
        rejectedbutton= findViewById(R.id.rejectbtn);
        appointrequesthome= findViewById(R.id.aptreqhome);

        appointrequesthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppointmentRequests.this, HomePage.class);
                startActivity(i);
            }
        });

    }
}