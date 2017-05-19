package com.example.prabhusivanandam.datepickerdemo;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;

/**
 * Created by Prabhu Sivanandam on 19-May-17.
 */

public class TimePickerDialog extends DialogFragment {

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimeSettings settings=new TimeSettings(getActivity());
        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        android.app.TimePickerDialog dialog=new android.app.TimePickerDialog(getActivity(),settings,hour,minute,false);
        return dialog;
    }
}
