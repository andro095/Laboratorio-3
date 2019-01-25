package com.example.contactapp

import java.util.ArrayList


class MyContacts : iContact {

    internal var Contactos = ArrayList<Contact>()

    override fun add(contacto: Contact) {
        Contactos.add(contacto)
    }

    override fun phone(numero: Int): String {
        return "Se está llamando al: " + Integer.toString(numero)
    }

    override fun mail(destinatario: String): Array<String> {
        return arrayOf(destinatario, "Mi nombre es André Rodríguez y mi número es 56998418")
    }

    override fun getlistas(): ArrayList<String> {
        val result = ArrayList<String>()
        for (contact in Contactos) {
            result.add(contact.nombre + " - " + contact.telefono)
        }
        return result
    }
}
