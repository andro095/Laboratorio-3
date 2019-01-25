package com.example.contactapp;

import java.util.ArrayList;


public class MyContacts implements iContact{

    ArrayList<Contact> Contactos = new ArrayList<Contact>();

    @Override
    public void add(Contact contacto) {
        Contactos.add(contacto);
    }

    @Override
    public String phone(Contact contacto) {
        return "Se está llamando a: " + contacto.getNombre();
    }

    @Override
    public String mail(Contact contacto) {
        return "Mi nombre es André Rodríguez y mi número es 56998418";
    }
}
