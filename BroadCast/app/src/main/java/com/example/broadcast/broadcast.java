package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction()!=null && intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            boolean isAirPlaneMode=intent.getBooleanExtra("state",false);
            String msg=isAirPlaneMode ? "Airplane mode is on" :"Airplane mode is off";
            Toast.makeText(context,""+msg,Toast.LENGTH_SHORT).show();
        }
    }
}
