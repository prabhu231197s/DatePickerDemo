package com.example.prabhusivanandam.datepickerdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setDate(View v)
    {
        PickerDialog dialog=new PickerDialog();
        dialog.show(getSupportFragmentManager(),"date_picker");
    }

    public void setTime(View v)
    {
        TimePickerDialog dialog=new TimePickerDialog();
        dialog.show(getSupportFragmentManager(),"time_picker");
    }
}
