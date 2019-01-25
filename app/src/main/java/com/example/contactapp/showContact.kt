package com.example.contactapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast

class showContact : AppCompatActivity() {

    lateinit var global: MyAplication
    internal var ContactInfo: Array<String>? = null
    internal var bundle: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_contact)
        global = applicationContext as MyAplication
        val i = intent
        bundle = i.extras
        ContactInfo = bundle!!.getStringArray("Contacto")
        val Name = findViewById<View>(R.id.Name) as TextView
        val Phone = findViewById<View>(R.id.Phone) as TextView
        val Email = findViewById<View>(R.id.Email) as TextView
        Name.text = ContactInfo!![0]
        Phone.text = ContactInfo!![1]
        Email.text = ContactInfo!![2]
        Phone.setOnClickListener(object : View.OnClickListener {

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            override fun onClick(v: View) {
                val Numero = bundle!!.getInt("position")
                Toast.makeText(baseContext, global.misContactos.phone(global.misContactos.Contactos[Numero].telefono), Toast.LENGTH_LONG)
            }
        })
    }

    fun Regresar(view: View) {
        val i = Intent(this, Principal::class.java)
        startActivity(i)
    }
}
