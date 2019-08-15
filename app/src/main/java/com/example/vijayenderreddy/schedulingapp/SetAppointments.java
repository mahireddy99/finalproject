package com.example.vijayenderreddy.schedulingapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class SetAppointments extends AppCompatActivity {
     Button button;
    static EditText editText;

    String[] category = { "Group Discussion","FINANCE","SEMESTER EXAMS","SCHEDULE","PROJECT","ADMISSIONS" };
    String[] days ={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_appointments);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice,category);
        AutoCompleteTextView acTextView = findViewById(R.id.categedt);
        acTextView.setThreshold(1);
        acTextView.setAdapter(adapter);

        ArrayAdapter<String> dayAdapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice,days);
        AutoCompleteTextView dayTextView = findViewById(R.id.aptdayedt);
        dayTextView.setThreshold(1);
        dayTextView.setAdapter(dayAdapter);


        TextView textView,textView1,textView2,textView3,textView4,textView5;
        final EditText editText1,editText2,editText3,editText4,editText5;
        Button invitebutton,button;

       textView= findViewById(R.id.appdatetxt);
        textView1= findViewById(R.id.aptdattxt);
        textView2= findViewById(R.id.starttimtxt);
        textView3= findViewById(R.id.endtimtxt);
        textView4= findViewById(R.id.roomnotxt);
        textView5= findViewById(R.id.categtxt);


        editText2= findViewById(R.id.starttimeedt);
        editText3= findViewById(R.id.endtimeedt);
        editText4= findViewById(R.id.roomnoedt);
        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(SetAppointments.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        editText2.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
            }
        });

        editText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(SetAppointments.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        editText3.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
            }
        });

        invitebutton= findViewById(R.id.invitebtn);

        invitebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button= findViewById(R.id.datebutton);
        editText= findViewById(R.id.aptdateedt);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment=new DatePickerFragment();
                newFragment.show(getSupportFragmentManager(), "datepicker");
            }
        });

    }

    public static class DatePickerFragment extends DialogFragment implements    DatePickerDialog.OnDateSetListener{
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int  day) {
            String years=""+year;
            String months=""+(monthOfYear+1);
            String days=""+day;
            if(monthOfYear>=0 && monthOfYear<9){
                months="0"+(monthOfYear+1);
            }
            if(day>0 && day<10){
                days="0"+day;

            }
            editText.setText(days+"/"+months+"/"+years);


        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            //use the current date as the default date in the picker
            final Calendar c=Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog=null;
            datePickerDialog=new DatePickerDialog(getActivity(), this, year,  month, day);

            return datePickerDialog;
        }









    }


}