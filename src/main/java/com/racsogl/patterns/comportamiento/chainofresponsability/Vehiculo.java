package com.racsogl.patterns.comportamiento.chainofresponsability;

/**
 * Gestiona una descripción sencilla que se proporciona en su momento de construcción.
 */
public class Vehiculo extends ObjetoBasico {
    private String descripcion;

    public Vehiculo() {
        super();
    }

    Vehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    protected String getDescripcion() {
        return descripcion;
    }
}
