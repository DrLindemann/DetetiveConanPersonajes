package org.example;

public class Personaje {

    private  String nombre;
    private int edad;
    private String genero;

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
