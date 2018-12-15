package com.racsogl.patterns.construccion.abstractfactory;

/**
 * Clase abstracta que representa un producto.
 */
public abstract class Scooter {
    String modelo;
    String color;
    int potencia;

    Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas();
}
