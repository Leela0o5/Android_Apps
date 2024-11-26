package com.example.contactsapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends AndroidViewModel {

    //if u need to use context inside ur viewmodel
    //u should use AndroidViewModel(AVM)
    //because it contains application context

 private Repository myRepository;
 private LiveData<List<Contacts>> allContacts;
//livedata

    public MyViewModel(@NonNull Application application) {
        super(application);
        this.myRepository = new Repository(application);
    }
    public LiveData<List<Contacts>> getAllcontacts(){
        allContacts = myRepository.getAllContacts();
        return allContacts;
    }

    public void addnewContact(Contacts contact){
        myRepository.addContact(contact);
    }
    public void deletecontact(Contacts contact){
        myRepository.deleteContact(contact);
    }


}


