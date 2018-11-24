package com.racsogl.patterns.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Dibuja la lista de vehiculos destinados a la venta.
 * <p>
 * Se utiliza un algoritmo con dos versiones para calcular la representación grafica en función del navegador.
 * 1v. Un vehículo por línea
 * 2v. Tres vehículos por línea
 */
public class VistaCatalogo {
    protected List<VistaVehiculo> contenido = new ArrayList<>();
    private DibujaCatalogo dibujo;

    VistaCatalogo(final DibujaCatalogo dibujo) {
        // Creamos los datos a pintar en pantalla
        contenido.add(new VistaVehiculo("vehiculo economico"));
        contenido.add(new VistaVehiculo("vehiculo amplio"));
        contenido.add(new VistaVehiculo("vehiculo rapido"));
        contenido.add(new VistaVehiculo("vehiculo confortable"));
        contenido.add(new VistaVehiculo("vehiculo deportivo"));
        this.dibujo = dibujo;
    }

    public void dibuja() {
        dibujo.dibuja(contenido);
    }
}

