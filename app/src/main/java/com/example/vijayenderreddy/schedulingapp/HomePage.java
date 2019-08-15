package com.example.vijayenderreddy.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Button acceptRequestbtn,appointmentRequestbtn,appointmentHistorybtn,createProfilebtn,currentAppointmentbtn,
                   logoutbutton,setAppointmentsbtn,setAvailabilitybtn,viewAvailabilitybtn;

        acceptRequestbtn = findViewById(R.id.accrequestsbtn);
        appointmentHistorybtn = findViewById(R.id.apphistorybtn);
        appointmentRequestbtn = findViewById(R.id.apprequestbtn);
        createProfilebtn = findViewById(R.id.createprobtn);
        currentAppointmentbtn = findViewById(R.id.crntappbtn);
        logoutbutton = findViewById(R.id.logoutbtn);
        setAppointmentsbtn = findViewById(R.id.setappbtn);
        setAvailabilitybtn = findViewById(R.id.setavailabhomebtn);
        viewAvailabilitybtn = findViewById(R.id.viewstaffbtn);


        acceptRequestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, AcceptedRequests.class);
                startActivity(i);
            }
        });

        appointmentHistorybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, AppointmentsHistory.class);
                startActivity(i);
            }
        });
        appointmentRequestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, AppointmentRequests.class);
                startActivity(i);
            }
        });
        createProfilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, CreateProfile.class);
                startActivity(i);
            }
        });
        currentAppointmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, CurrentAppointments.class);
                startActivity(i);
            }
        });
        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, LogOut.class);
                startActivity(i);
            }
        });
        setAppointmentsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, SetAppointments.class);
                startActivity(i);
            }
        });
        setAvailabilitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, SetAvailability.class);
                startActivity(i);
            }
        });
        viewAvailabilitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, ViewAvailability.class);
                startActivity(i);
            }
        });





    }
}