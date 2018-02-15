package com.racsogl.patterns.construccion.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BicicletaElectrica extends Bicicleta {
    private final static Logger LOGGER = LoggerFactory.getLogger(BicicletaElectrica.class);

    BicicletaElectrica(String rueda, String color, String marca) {
        super(rueda, color, marca);
    }

    public void mostrarCaracteristicas() {
        LOGGER.debug("Bicicleta electrica de marca: " + marca +
                " de color: " + color + " de rueda: " +
                rueda);
    }
}
