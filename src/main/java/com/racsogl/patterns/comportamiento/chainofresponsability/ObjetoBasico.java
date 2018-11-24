package com.racsogl.patterns.comportamiento.chainofresponsability;

/**
 * Implementa la cadena de responsabilidad mediante el atributo siguiente.
 */
public abstract class ObjetoBasico {

    private ObjetoBasico siguiente;

    private String descripcionPorDefecto() {
        return "descripcion por defecto";
    }

    protected abstract String getDescripcion();

    String devuelveDescripcion() {
        String resultado = this.getDescripcion();
        if (resultado != null)
            return resultado;
        if (siguiente != null)
            return siguiente.devuelveDescripcion();
        else
            return this.descripcionPorDefecto();
    }

    void setSiguiente(ObjetoBasico siguiente) {
        this.siguiente = siguiente;
    }
}
