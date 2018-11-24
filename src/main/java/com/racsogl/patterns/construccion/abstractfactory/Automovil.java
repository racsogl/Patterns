package com.racsogl.patterns.construccion.abstractfactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase abstracta que representa un producto.
 */
@Getter
@Setter
public abstract class Automovil {
    String modelo;
    String color;
    int potencia;
    double espacio;

    Automovil(String modelo, String color, int
            potencia, double espacio) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    public abstract void mostrarCaracteristicas();
}
