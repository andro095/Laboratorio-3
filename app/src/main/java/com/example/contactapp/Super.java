package com.example.contactapp;

import java.util.ArrayList;

public class Super extends ArrayList<Contact> {
    ArrayList<Contact> contacts;

    public Super() {
        this.contacts = new ArrayList<Contact>();
    }

    @Override
    public boolean add(Contact s) {
        return contacts.add(s);
    }

    @Override
    public Contact get(int index) {
        return contacts.get(index);
    }
    public ArrayList<Contact> getContactos (){
        return contacts;
    }
}
