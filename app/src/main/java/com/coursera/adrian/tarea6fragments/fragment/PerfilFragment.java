package com.coursera.adrian.tarea6fragments.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.coursera.adrian.tarea6fragments.adapter.ContactoAdaptador;
import com.coursera.adrian.tarea6fragments.pojo.Mascota;
import com.coursera.adrian.tarea6fragments.R;

import java.util.ArrayList;


/**
 * Created by Adrian on 07/04/2017.
 */

public class PerfilFragment extends Fragment {

    private ImageView fotoPerfil;
    private TextView nombrePerfil;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.perfil, container, false);

        //fotoPerfil = (ImageView) v.findViewById(R.id.foto_perfil);
       // fotoPerfil.setImageResource(R.drawable.lenon);

        nombrePerfil = (TextView) v.findViewById(R.id.nombre_perfil);
        nombrePerfil.setText(getResources().getString(R.string.Lenon));

        RecyclerView rclFotos = (RecyclerView) v.findViewById(R.id.lista_fotos);
        ArrayList<Mascota> fotosMascota = new ArrayList<Mascota>();

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        rclFotos.setLayoutManager(glm);
        rclFotos.setHasFixedSize(true);
        iniciarAdaptador(fotosMascota, rclFotos);

        Mascota mascota1 = new Mascota("Lenon", R.drawable.lenon);
        Mascota mascota2 = new Mascota("Lenon", R.drawable.lenon);
        Mascota mascota3 = new Mascota("Lenon", R.drawable.lenon);
        Mascota mascota4 = new Mascota("Lenon", R.drawable.lenon);


        fotosMascota.add(mascota1);
        fotosMascota.add(mascota2);
        fotosMascota.add(mascota3);
        fotosMascota.add(mascota4);


        return v;
    }

    public void iniciarAdaptador(ArrayList<Mascota> mascotas, RecyclerView rclMascotas){
        ContactoAdaptador adaptador = new ContactoAdaptador(mascotas, getActivity());
        rclMascotas.setAdapter(adaptador);

    }

}
