package com.racsogl.patterns.comportamiento.strategy;

/*
Objeto que representa lo que se va a mostrar por pantalla.
 */
public class VistaVehiculo {
    private String descripcion;

    VistaVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    public void dibuja() {
        System.out.print(descripcion);
    }
}
