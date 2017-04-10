package com.coursera.adrian.tarea6fragments.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import com.coursera.adrian.tarea6fragments.DetalleContacto;
import com.coursera.adrian.tarea6fragments.pojo.Mascota;
import com.coursera.adrian.tarea6fragments.R;

/**
 * Created by Adrian on 07/04/2017.
 */

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder>{

    private Activity activity;
    private ArrayList<Mascota> mascotas;

    public ContactoAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.amigo, parent, false);
        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ContactoViewHolder holder, int position) {
        final Mascota contacto = mascotas.get(position);
        holder.foto.setImageResource(contacto.getFoto());
        holder.nombre.setText(contacto.getNombre());

        holder.bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contacto.setLike(Integer.parseInt(holder.like.getText().toString())+1);
                holder.like.setText("" + contacto.getLike());
            }
        });

        holder.foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, DetalleContacto.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nombre;
        private TextView like;
        private ImageButton bone;

        public ContactoViewHolder(View itemView) {
            super(itemView);
            foto = (ImageView) itemView.findViewById(R.id.foto);
            nombre = (TextView) itemView.findViewById(R.id.nomrbe);
            like = (TextView) itemView.findViewById(R.id.like);
            bone = (ImageButton) itemView.findViewById(R.id.img_bone);
        }
    }
}
