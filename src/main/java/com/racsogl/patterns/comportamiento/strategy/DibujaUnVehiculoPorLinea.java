package com.racsogl.patterns.comportamiento.strategy;

import java.util.List;

/**
 * Estrategias concretas
 * Clase que implementa el algoritmo de como dibujar.
 */
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {
    @Override
    public void dibuja(final List<VistaVehiculo> contenido) {
        System.out.println(
                "Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vistaVehiculo: contenido)
        {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
