package com.example.contactsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MainActivityclickHandler {
    Context context;

    public MainActivityclickHandler(Context context) {
        this.context = context;
    }

    public void onFABClicked(View view){
        Intent i=new Intent(view.getContext(),AddNewContact.class);
        context.startActivity(i);
    }
}
