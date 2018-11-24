package com.racsogl.patterns.construccion.builder;

/**
 * Es la clase de encargada de construir el producto a partir de la interfaz del constructor.
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor)
    {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente)
    {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion
                (nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
