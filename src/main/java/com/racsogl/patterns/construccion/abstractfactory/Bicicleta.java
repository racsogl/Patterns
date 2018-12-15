package com.racsogl.patterns.construccion.abstractfactory;

/**
 * Clase abstracta que representa un producto.
 */
public abstract class Bicicleta {
    String rueda;
    String color;
    String marca;

    Bicicleta(String rueda, String color, String marca) {
        this.rueda = rueda;
        this.color = color;
        this.marca = marca;
    }

    public abstract void mostrarCaracteristicas();
}
