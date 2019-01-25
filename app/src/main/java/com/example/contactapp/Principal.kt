package com.example.contactapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

import java.util.ArrayList

class Principal : AppCompatActivity() {

    lateinit var  global: MyAplication
    lateinit var Info: ArrayList<String>
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        global = applicationContext as MyAplication
        Info = global.misContactos.getlistas()
        adapter = ArrayAdapter(this, R.layout.item, Info)
        val listView = findViewById<View>(R.id.ListaContactos) as ListView
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val textView = view as TextView
            val bundle = Bundle()
            val Contactinfo = arrayOf(global.misContactos.Contactos[position].nombre, Integer.toString(global.misContactos.Contactos[position].telefono), global.misContactos.Contactos[position].correo)
            bundle.putStringArray("Contacto", Contactinfo)
            bundle.putInt("position", position)
            val i = Intent(applicationContext, showContact::class.java)
            i.putExtras(bundle)
            startActivity(i)
        }


    }

    fun AgregarContacto(view: View) {
        val i = Intent(applicationContext, makeContact::class.java)
        startActivity(i)
    }
}
