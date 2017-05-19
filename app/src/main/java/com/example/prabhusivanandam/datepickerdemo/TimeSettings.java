package com.example.prabhusivanandam.datepickerdemo;

import android.app.*;
import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Prabhu Sivanandam on 19-May-17.
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener {

    Context ctx;

    public TimeSettings(Context context)
    {
        this.ctx=context;
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(ctx,"Time is  "+hourOfDay+"  "+minute,Toast.LENGTH_LONG).show();
    }
}
