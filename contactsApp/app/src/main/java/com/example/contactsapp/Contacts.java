package com.example.contactsapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts_table")
public class Contacts {
    @ColumnInfo(name="contact_id")
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="contact_name")
    private String contact_name;
    @ColumnInfo(name="contact_email")
    private String contact_email;

    public Contacts(String contact_name,String contact_email) {
        this.contact_name=contact_name;
        this.contact_email=contact_email;
    }

    public Contacts() {
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }
}
