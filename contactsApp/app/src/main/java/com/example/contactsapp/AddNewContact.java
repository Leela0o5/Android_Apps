package com.example.contactsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.contactsapp.databinding.ActivityAddNewContactBinding;

public class AddNewContact extends AppCompatActivity {
 private ActivityAddNewContactBinding binding;
 private AddNewContactClickHandler handler;
 private  Contacts contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_contact);
        MyViewModel viewModel=new ViewModelProvider(this).get(MyViewModel.class);
        contacts= new Contacts();

        binding= DataBindingUtil.setContentView(this,R.layout.activity_add_new_contact);
        handler = new AddNewContactClickHandler(contacts,this,viewModel);
        binding.setContact(contacts);
        binding.setClickHa(handler);
    }
}