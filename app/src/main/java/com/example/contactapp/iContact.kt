package com.example.contactapp

import java.util.ArrayList

interface iContact {
    fun add(contacto: Contact)
    fun phone(numero: Int): String
    fun mail(destinatario: String): Array<String>
    fun getlistas(): ArrayList<String>

    companion object {
        val Contactos = ArrayList<Contact>()
    }


}
