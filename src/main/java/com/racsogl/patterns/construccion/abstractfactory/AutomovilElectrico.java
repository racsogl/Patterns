package com.racsogl.patterns.construccion.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Subclases concretas que deriva del producto.
 */
public class AutomovilElectrico extends Automovil {
    private final static Logger LOGGER = LoggerFactory.getLogger(AutomovilElectrico.class);

    AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        LOGGER.debug("Automovil electrico de modelo: " + modelo +
                " de color: " + color + " de potencia: " +
                potencia + " de espacio: " + espacio);
    }
}
