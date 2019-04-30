package com.racsogl.patterns.construccion.abstracfactoryswitch;

public class Payment extends InvoiceBase {
    InvoiceBase create() {
        return new Payment();
    }
}
