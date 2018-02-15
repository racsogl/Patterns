package com.racsogl.patterns.construccion.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Subclases concretas que deriva del producto.
 */
public class ScooterGasolina extends Scooter {
    private final static Logger LOGGER = LoggerFactory.getLogger(ScooterGasolina.class);

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    public void mostrarCaracteristicas() {
        LOGGER.debug("Automovil gasolina de modelo: " + modelo +
                " de color: " + color + " de potencia: " +
                potencia);

    }
}
