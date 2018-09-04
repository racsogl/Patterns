package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

/**
 * Created by oscar on 15/06/2018.
 */
public class Banco implements ApruebaPrestamo {

    private ApruebaPrestamo next;

    public void setNext(ApruebaPrestamo apruebaPrestamo) {
        next = apruebaPrestamo;
    }

    public ApruebaPrestamo getNext() {
        return next;
    }

    public void solicitudPrestamo(Double cantidad) {
        Gerente gerente = new Gerente();
        this.setNext(gerente);
        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(cantidad);

    }
}
