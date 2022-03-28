package com.example.date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textview;
Calendar calendar;
SimpleDateFormat simpleDateFormat;
String Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
calendar=Calendar.getInstance();
simpleDateFormat= new SimpleDateFormat("ddd-MM-yyyy HH:mm:SS");
        button =(Button) findViewById(R.id.button);
        textview=(TextView) findViewById(R.id.textview);
Date=simpleDateFormat.format(calendar.getTime());

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        textview.setText(Date);
    }
});
    }
}