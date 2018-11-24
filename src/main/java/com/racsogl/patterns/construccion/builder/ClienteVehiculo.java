package com.racsogl.patterns.construccion.builder;

import java.util.Scanner;

public class ClienteVehiculo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        Creamos un constructor cocreto
        ConstructorDocumentacionVehiculo constructor;
        System.out.print("Desea generar " +
                "documentacion HTML (1) o PDF (2):");
        String seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHtml();
        } else {
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }

//        Creamos un vendedor concreto bajo demanda invocando al constructor
        Vendedor vendedor = new Vendedor(constructor);

        Documentacion documentacion = vendedor.construye("Martin");

        // obtenemos resultado
        documentacion.imprime();
    }
}