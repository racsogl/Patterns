package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

/**
 * Created by oscar on 15/06/2018.
 */
public class Banco {

    public void solicitudPrestamo(Double cantidad) {
        Gerente gerente = new Gerente();
        Director director = new Director();
        gerente.setNext(director);
        gerente.solicitudPrestamo(cantidad);
    }
}
