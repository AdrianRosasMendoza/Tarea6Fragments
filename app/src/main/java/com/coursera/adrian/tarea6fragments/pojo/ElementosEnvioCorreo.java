package com.coursera.adrian.tarea6fragments.pojo;


public class ElementosEnvioCorreo {
    private String correo;
    private String mensaje;
    private String nombre;

    public ElementosEnvioCorreo(String correo, String mensaje, String nombre) {
        this.correo = correo;
        this.mensaje = mensaje;
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}