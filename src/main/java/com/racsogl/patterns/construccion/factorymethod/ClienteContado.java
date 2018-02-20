package com.racsogl.patterns.construccion.factorymethod;

public class ClienteContado extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
