package com.racsogl.patterns.construccion.abstractfactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo {
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }

    public Bicicleta creaBicicleta(String rueda, String color, String marca) {
//  No obstante si fuera necesario incluir nuevas clases de familias de vehículos
// (diésel o mixto gasolina-eléctrico), las modificaciones a realizar en el objeto Catálogo pueden ser bastante pesadas.
        return null;
    }

}
