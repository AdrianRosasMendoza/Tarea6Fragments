package com.coursera.adrian.tarea6fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.coursera.adrian.tarea6fragments.adapter.ContactoAdaptador;
import com.coursera.adrian.tarea6fragments.pojo.Mascota;

/**
 * Created by Adrian on 07/04/2017.
 */


    public class RankingMascota extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.favoritos);

            Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
            setSupportActionBar(miActionBar);

            getSupportActionBar().setTitle(R.string.titulo_actionbar);
            getSupportActionBar().setIcon(R.drawable.huella);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
            Mascota mascota1 = new Mascota("Lenon",R.drawable.lenon);
            Mascota mascota2 = new Mascota("Ghost", R.drawable.ghost);
            Mascota mascota3 = new Mascota("Mishky", R.drawable.mishky);
            Mascota mascota4 = new Mascota("Baloo", R.drawable.baloo);
            Mascota mascota5 = new Mascota("Wero", R.drawable.wero);

            mascotas.add(mascota1);
            mascotas.add(mascota2);
            mascotas.add(mascota3);
            mascotas.add(mascota4);
            mascotas.add(mascota5);

            RecyclerView rclMascotas = (RecyclerView) findViewById(R.id.mascotas_favoritas);

            LinearLayoutManager llm = new LinearLayoutManager(this);
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            rclMascotas.setLayoutManager(llm);
            iniciarAdaptador(mascotas, rclMascotas);
        }

        public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
            ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, RankingMascota.this);
            rclMascotas.setAdapter(adaptador);

        }
    }


