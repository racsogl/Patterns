package com.racsogl.patterns.construccion.factorymethod;

public class PedidoContado extends Pedido {
    public PedidoContado(double importe) {
        super(importe);
    }

    public boolean valida() {
        return true;
    }

    public void paga() {
        System.out.println(
                "El pago del pedido por importe de: " +
                        importe + " se ha realizado.");

    }
}
