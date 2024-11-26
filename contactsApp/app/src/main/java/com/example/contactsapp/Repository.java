package com.example.contactsapp;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    //available data sourcse are -ROOM Database
    ExecutorService executor;
    Handler handler;

    private final ContactDA0 contactDA0;


    public Repository(Application application) {
       //initializing database in the repository
        ContactsDataBase contactsDataBase=ContactsDataBase.getInstance(application);
        //initialize dao in repository
        this.contactDA0 = contactsDataBase.getContactDao();
        //avoid concurrency issues when dealing with database accsess used for background db services
        executor= Executors.newSingleThreadExecutor();
        //used for updating ui
        handler=new Handler(Looper.getMainLooper());


    }

    //methods in dao being executed from repository
    public void addContact(Contacts contact){

        executor.execute(new Runnable() {
            @Override
            public void run() {
                //Execute this code asynchronously on seperate thread
                contactDA0.insert(contact);
            }
        });



    }
    public void deleteContact(Contacts contact){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDA0.delete(contact);
            }
        });

    }
    public LiveData<List<Contacts>> getAllContacts(){
        return contactDA0.getAllcontact();
    }





}
