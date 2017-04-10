package com.coursera.adrian.tarea6fragments.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.ArrayList;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;

import com.coursera.adrian.tarea6fragments.adapter.ContactoAdaptador;
import com.coursera.adrian.tarea6fragments.pojo.Mascota;
import com.coursera.adrian.tarea6fragments.R;

/**
 * Created by Adrian on 07/04/2017.
 */
public class RecyclerViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);

        RecyclerView rclMascotas = (RecyclerView) v.findViewById(R.id.lista_contactos);
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rclMascotas.setLayoutManager(llm);
        iniciarAdaptador(mascotas, rclMascotas);

        Mascota mascota1 = new Mascota("Lenon", R.drawable.lenon);
        Mascota mascota2 = new Mascota("Ghost", R.drawable.ghost);
        Mascota mascota3 = new Mascota("Mishky", R.drawable.mishky);
        Mascota mascota4 = new Mascota("Baloo", R.drawable.baloo);
        Mascota mascota5 = new Mascota("Wero", R.drawable.wero);

        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);

        return v;
    }


    public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
        ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, getActivity());
        rclMascotas.setAdapter(adaptador);

    }
}
