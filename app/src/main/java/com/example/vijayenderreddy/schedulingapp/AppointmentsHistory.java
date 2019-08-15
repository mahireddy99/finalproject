package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppointmentsHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointmentshistory);

        Button apphistoryHome;
        apphistoryHome = findViewById(R.id.apthtryhome);

        apphistoryHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppointmentsHistory.this, HomePage.class);
                startActivity(i);
            }
        });

    }
}