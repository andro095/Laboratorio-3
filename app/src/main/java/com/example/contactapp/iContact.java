package com.example.contactapp;

import java.util.ArrayList;

public interface iContact {
    ArrayList<Contact> Contactos = new ArrayList<Contact>();
    void add (Contact contacto);
    String phone (int numero);
    String[] mail (String destinatario);
    ArrayList<String> getlistas ();



}
