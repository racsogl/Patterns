package com.racsogl.patterns.construccion.factorymethod;

public class ClienteCredito extends Cliente {

    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
