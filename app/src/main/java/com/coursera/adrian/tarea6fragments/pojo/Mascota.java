package com.coursera.adrian.tarea6fragments.pojo;

/**
 * Created by Adrian on 07/04/2017.
 */

public class Mascota {

    private String nombre;
    private String raza;
    private String email;
    private int foto;
    private int like;

    public Mascota(){

    }

    public Mascota(String nombre, int foto){
        this.nombre = nombre;
        this.foto = foto;
        this.like = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getFoto() {

        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void ganarLike(){
        like++;
    }

}
