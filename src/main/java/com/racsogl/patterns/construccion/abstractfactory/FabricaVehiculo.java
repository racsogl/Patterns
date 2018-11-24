package com.racsogl.patterns.construccion.abstractfactory;

public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color,
                            int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int
            potencia);

    Bicicleta creaBicicleta(String rueda, String color, String marca);
}
