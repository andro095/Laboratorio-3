package com.example.contactapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.example.contactapp.MyAplication;
import com.example.contactapp.R;

public class makeContact extends AppCompatActivity {

    MyAplication global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_contact);
        global = (MyAplication) getApplicationContext();
    }
    public void CrearContacto(View view){
        TextView nombre = (TextView) findViewById(R.id.Name);
        TextView numero = (TextView) findViewById(R.id.Phone);
        TextView email = (TextView) findViewById(R.id.Email);
        Contact newcontact = new Contact(nombre.getText().toString(),email.getText().toString(),Integer.parseInt(numero.getText().toString()));
        global.misContactos.add(newcontact);
        Toast.makeText(getBaseContext(), "Se agregó contacto", Toast.LENGTH_LONG).show();

    }
    public void Regresar(View view) {
        Intent i = new Intent(getApplicationContext(), Principal.class);
        startActivity(i);
    }
}
