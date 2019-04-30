package com.racsogl.patterns.construccion.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FabricaVehiculoTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void fabricaVehiculosElectricidad() {

        FabricaVehiculo fabricaVehiculo = new FabricaVehiculoElectricidad();

        final Automovil automovil = fabricaVehiculo.creaAutomovil("Ferrari", "rojo", 300, 30D);
        final Scooter scooter = fabricaVehiculo.creaScooter("Yamaha", "verde", 30);
        Bicicleta bicicleta = ((FabricaVehiculoElectricidad) fabricaVehiculo).creaBicicleta("27,5", "rojo", "Orbea");

        automovil.mostrarCaracteristicas();
        scooter.mostrarCaracteristicas();
        bicicleta.mostrarCaracteristicas();

        fabricaVehiculo = new FabricaVehiculoGasolina();



    }

}