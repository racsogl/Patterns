package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

import com.racsogl.patterns.comportamiento.strategy.DibujaCatalogo;

/**
 * Created by oscar on 15/06/2018.
 */
public class Banco implements ApruebaPrestamo {

    private ApruebaPrestamo next;

    @Override
    public void setNext(ApruebaPrestamo apruebaPrestamo) {
        next = apruebaPrestamo;
    }

    @Override
    public ApruebaPrestamo getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(Double cantidad) {
        Gerente gerente = new Gerente();
        this.setNext(gerente);
        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(cantidad);

    }
}
