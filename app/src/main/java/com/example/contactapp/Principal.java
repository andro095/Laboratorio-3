package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    MyAplication global;
    ArrayList <String> Info;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        global = (MyAplication) getApplicationContext();
        Info = global.misContactos.getlistas();
        adapter = new ArrayAdapter <String> (this, R.layout.item,Info);
        ListView listView = (ListView) findViewById(R.id.ListaContactos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                Bundle bundle = new Bundle();
                String[] Contactinfo = {global.misContactos.Contactos.get(position).getNombre(), Integer.toString(global.misContactos.Contactos.get(position).getTelefono()) ,global.misContactos.Contactos.get(position).getCorreo()};
                bundle.putStringArray("Contacto",Contactinfo);
                Intent i = new Intent(getApplicationContext(), showContact.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


    }
    public void AgregarContacto(View view){
        Intent i = new Intent(getApplicationContext(), makeContact.class);
        startActivity(i);
    }
}
