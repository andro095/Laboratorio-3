package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class showContact extends AppCompatActivity {

    String[] ContactInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contact);
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        ContactInfo = bundle.getStringArray("Contacto");
        TextView Name = (TextView) findViewById(R.id.Name);
        TextView Phone = (TextView) findViewById(R.id.Phone);
        TextView Email = (TextView) findViewById(R.id.Email);
        Name.setText(ContactInfo[0]);
        Phone.setText(ContactInfo[1]);
        Email.setText(ContactInfo[2]);
    }
    public void Regresar (View view){
        Intent i = new Intent(this, Principal.class);
        startActivity(i);
    }
    public void Llamar(){

    }
}
