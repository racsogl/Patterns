package com.racsogl.patterns.construccion.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que define el producto.
 * Puede ser abstract y poseer varias subclases en casos de impl. diferentes.
 */
public abstract class Documentacion {
    List<String> contenido = new ArrayList<String>();

    public abstract void agregaDocumento(String documento);
    public abstract void imprime();
}
