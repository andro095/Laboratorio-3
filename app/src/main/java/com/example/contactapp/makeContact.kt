package com.example.contactapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.contactapp.MyAplication
import com.example.contactapp.R

class makeContact : AppCompatActivity() {

    lateinit var global: MyAplication
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_contact)
        global = applicationContext as MyAplication
    }

    fun CrearContacto(view: View) {
        val nombre = findViewById<View>(R.id.Name) as TextView
        val numero = findViewById<View>(R.id.Phone) as TextView
        val email = findViewById<View>(R.id.Email) as TextView
        val newcontact = Contact(nombre.text.toString(), email.text.toString(), Integer.parseInt(numero.text.toString()))
        global.misContactos.add(newcontact)
        Toast.makeText(baseContext, "Se agregó contacto", Toast.LENGTH_LONG).show()

    }

    fun Regresar(view: View) {
        val i = Intent(applicationContext, Principal::class.java)
        startActivity(i)
    }
}
