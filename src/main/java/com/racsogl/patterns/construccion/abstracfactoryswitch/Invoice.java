package com.racsogl.patterns.construccion.abstracfactoryswitch;

public class Invoice extends InvoiceBase {
    InvoiceBase create() {
        return new Invoice();
    }
}
