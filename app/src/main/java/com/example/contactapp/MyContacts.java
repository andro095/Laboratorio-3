package com.example.contactapp;

import java.util.ArrayList;


public class MyContacts implements iContact{

    ArrayList<Contact> Contactos = new ArrayList<Contact>();

    @Override
    public void add(Contact contacto) {
        Contactos.add(contacto);
    }

    @Override
    public String phone(int numero) {
        return "Se está llamando al: " + Integer.toString(numero);
    }

    @Override
    public String[] mail(String destinatario) {
        String[] elementos = {destinatario, "Mi nombre es André Rodríguez y mi número es 56998418"};
        return elementos;
    }

    @Override
    public ArrayList<String> getlistas() {
        ArrayList<String> result = new ArrayList<String>();
        for (Contact contact: Contactos) {
            result.add(contact.getNombre() + " - " + contact.getTelefono());
        }
        return result;
    }
}
