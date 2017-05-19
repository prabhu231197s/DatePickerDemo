package com.example.prabhusivanandam.datepickerdemo;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by Prabhu Sivanandam on 19-May-17.
 */

public class DateSettings implements DatePickerDialog.OnDateSetListener {

    Context ctx;

    public DateSettings(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(ctx,"Date selected successfully"+ year+"  "+month+"  "+dayOfMonth,Toast.LENGTH_LONG).show();
    }
}
