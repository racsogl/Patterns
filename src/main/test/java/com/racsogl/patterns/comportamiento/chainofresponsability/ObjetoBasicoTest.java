package com.racsogl.patterns.comportamiento.chainofresponsability;

import static org.junit.Assert.*;

public class ObjetoBasicoTest {

    @org.junit.Test
    public void devuelveDescripcionVehiculo() {
        ObjetoBasico vehiculo = new Vehiculo(
                "Auto++ KT500 Vehiculo de ocasion en buen estado");

        assertNotNull(vehiculo.getDescripcion());
        assertTrue(vehiculo.devuelveDescripcion().contains("KT500"));
    }

    @org.junit.Test
    public void devuelveDescripcionModelo() {
        ObjetoBasico modelo = new Modelo("KT400",
                "Vehiculo amplio y confortable");
        ObjetoBasico vehiculo = new Vehiculo();
        vehiculo.setSiguiente(modelo);

        assertNull(vehiculo.getDescripcion());
        assertTrue(vehiculo.devuelveDescripcion().contains("KT400"));
    }

    @org.junit.Test
    public void devuelveDescripcionMarca() {
        ObjetoBasico marca = new Marca("Auto++",
                "Marca del automovil", "de gran calidad");
        ObjetoBasico modelo = new Modelo();
        modelo.setSiguiente(marca);
        ObjetoBasico vehiculo = new Vehiculo();
        vehiculo.setSiguiente(modelo);

        assertNull(vehiculo.getDescripcion());
        assertTrue(vehiculo.devuelveDescripcion().contains("Auto++"));

    }

    @org.junit.Test
    public void devuelvedefaultDescripcion() {
        ObjetoBasico vehiculo = new Vehiculo();

        assertNull(vehiculo.getDescripcion());
        assertTrue(vehiculo.devuelveDescripcion().contains("descripcion por defecto"));
    }
}





