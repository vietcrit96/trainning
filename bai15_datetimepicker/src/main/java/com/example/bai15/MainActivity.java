package com.example.bai15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker =findViewById(R.id.datePicker);
        timePicker =findViewById(R.id.timePicker);
        setDatePicker();
        setTimePicker();
    }
    public void setDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
         final int month= calendar.get(Calendar.MONTH);
        final int day= calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year,month,day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(MainActivity.this,dayOfMonth+"-"+(monthOfYear+1)+"-"+year, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setTimePicker() {
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
