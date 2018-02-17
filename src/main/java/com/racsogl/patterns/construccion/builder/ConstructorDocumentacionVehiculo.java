package com.racsogl.patterns.construccion.builder;

/**
 *  Define la firma de los métodos que construyen las distintas partes del producto
 *  así como la firma del método que permite obtener el producto,
 *  una vez construido.
 */
public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

    public Documentacion resultado() {
        return documentacion;
    }

}
