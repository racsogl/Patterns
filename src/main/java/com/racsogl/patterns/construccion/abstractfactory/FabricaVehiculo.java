package com.racsogl.patterns.construccion.abstractfactory;

/**
 * Contiene la firma de los métodos para definir cada producto.
 *
 * El tipo devuelto está constituido por las clases abstractas del producto.
 */
public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int potencia);
}
