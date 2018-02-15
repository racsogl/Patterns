package com.racsogl.patterns.construccion.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Subclases concretas que deriva del producto.
 */
public class ScooterElectrico extends Scooter {
    private final static Logger LOGGER = LoggerFactory.getLogger(ScooterElectrico.class);

    public ScooterElectrico(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    public void mostrarCaracteristicas() {
        LOGGER.debug("Scotter electrico de modelo: " + modelo +
                " de color: " + color + " de potencia: " +
                potencia);

    }
}
