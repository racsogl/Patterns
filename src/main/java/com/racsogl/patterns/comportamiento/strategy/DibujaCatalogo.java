package com.racsogl.patterns.comportamiento.strategy;

import java.util.List;

/**
 * Interfaz común a todos los algoritmos.
 */
public interface DibujaCatalogo {

    /* recibe una lista de vehiculos a imprimir */
    void dibuja(List<VistaVehiculo> contenido);
}
