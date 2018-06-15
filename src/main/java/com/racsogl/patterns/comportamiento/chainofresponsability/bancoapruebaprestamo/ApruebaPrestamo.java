package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

public interface  ApruebaPrestamo {

    void setNext(ApruebaPrestamo apruebaPrestamo);
    ApruebaPrestamo getNext();
    void solicitudPrestamo(Double cantidad);
}
