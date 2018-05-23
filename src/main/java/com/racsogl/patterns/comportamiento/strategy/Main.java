package com.racsogl.patterns.comportamiento.strategy;

public class Main {
    public static void main(String[] args) {
        VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new
                DibujaTresVehiculosPorLinea());
        vistaCatalogo1.dibuja();
        VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new
                DibujaUnVehiculoPorLinea());
        vistaCatalogo2.dibuja();
    }
}
