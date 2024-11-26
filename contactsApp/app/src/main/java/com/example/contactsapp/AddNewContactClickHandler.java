package com.example.contactsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {
    Contacts contact;
    Context context;
    MyViewModel myViewModel;

    public AddNewContactClickHandler(Contacts contact, Context context, MyViewModel viewModel) {
        this.contact = contact;
        this.context=context;
        this.myViewModel=viewModel;
    }



    public void onSubitBtnClicked(View view){
        if(contact.getContact_name()==null || contact.getContact_email()==null){
            Toast.makeText(context,"Fields can't be empty",Toast.LENGTH_LONG).show();
        }
        else{
           Intent i=new Intent(context, MainActivity.class);
          // i.putExtra("Name",contact.getContact_name());
          // i.putExtra("Email",contact.getContact_email());

            Contacts c=new Contacts(contact.getContact_name(), contact.getContact_email());
            myViewModel.addnewContact(c);

           context.startActivity(i);
        }
    }
}
