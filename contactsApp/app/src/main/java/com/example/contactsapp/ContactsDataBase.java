package com.example.contactsapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Contacts.class},version = 1)
public abstract class ContactsDataBase extends
        RoomDatabase {

  public abstract ContactDA0 getContactDao();


//singleton pattern
    private static ContactsDataBase dbInstance;

    public static synchronized ContactsDataBase getInstance(Context context){
           if(dbInstance==null){
             dbInstance= Room.databaseBuilder(context.getApplicationContext(),
                     ContactsDataBase.class,"contacts_db").fallbackToDestructiveMigration().build();
           }

              return dbInstance;

    }



}
