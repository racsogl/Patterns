package com.racsogl.patterns.construccion.abstractfactory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectrico(modelo, color, potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }

    public Bicicleta creaBicicleta(String rueda, String color, String marca) {
        return new BicicletaElectrica(rueda, color, marca);
    }
}
