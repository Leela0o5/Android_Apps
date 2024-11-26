package com.example.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Click {
    Context context;

    public Click(Context context) {
        this.context = context;
    }


   public void onBtnclicked(View view ){
       Toast.makeText(context,"The button is being clicked",Toast.LENGTH_LONG).show();
   }
}
