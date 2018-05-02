package com.racsogl.patterns.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Dibuja la lista de vehiculos destinados a la venta.
 *
 * Entidad.
 */
public class VistaCatalogo {
    protected List<VistaVehiculo> contenido = new ArrayList<>();
    protected DibujaCatalogo dibujo;

    public VistaCatalogo(DibujaCatalogo dibujo) {
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

