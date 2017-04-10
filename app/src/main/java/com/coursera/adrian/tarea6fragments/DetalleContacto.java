package com.coursera.adrian.tarea6fragments;

/**
 * Created by Adrian on 07/04/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacto);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(R.string.titulo_actionbar);
        getSupportActionBar().setIcon(R.drawable.huella);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
