package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

/**
 * Created by oscar on 15/06/2018.
 */
public class Gerente implements ApruebaPrestamo {

    private ApruebaPrestamo next;

    public void setNext(ApruebaPrestamo apruebaPrestamo) {
        next = apruebaPrestamo;
    }

    public ApruebaPrestamo getNext() {
        return next;
    }

    public void solicitudPrestamo(Double cantidad) {
        if (cantidad <= 100000) {
            System.out.println("Lo maneja el Gerente");
        } else {
            getNext().solicitudPrestamo(cantidad);
        }
    }
}
