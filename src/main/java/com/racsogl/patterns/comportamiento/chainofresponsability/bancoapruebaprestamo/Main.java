package com.racsogl.patterns.comportamiento.chainofresponsability.bancoapruebaprestamo;

/**
 * Created by oscar on 15/06/2018.
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitudPrestamo(200000D);
    }
}
