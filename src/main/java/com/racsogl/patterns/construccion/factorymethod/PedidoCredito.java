package com.racsogl.patterns.construccion.factorymethod;

public class PedidoCredito extends Pedido {
    public PedidoCredito(double importe) {
        super(importe);
    }

    public boolean valida() {
        return (importe >= 1000.0) && (importe <= 5000.0);
    }

    public void paga() {
        System.out.println(
                "El pago del pedido a credito de: " +
                        importe + " se ha realizado.");
    }
}
