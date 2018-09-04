package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

public class Director implements ApruebaPrestamo {
    private ApruebaPrestamo next;

    public void setNext(ApruebaPrestamo apruebaPrestamo) {
        this.next = apruebaPrestamo;
    }

    public ApruebaPrestamo getNext() {
        return next;
    }

    public void solicitudPrestamo(Double cantidad) {
        if (cantidad > 100000) {
            System.out.println("Lo maneja el Director");
        }

    }
}
