package com.racsogl.patterns.construccion.abstractfactory;

public abstract class Scooter {
    String modelo;
    String color;
    int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas();
}
