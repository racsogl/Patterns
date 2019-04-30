package com.racsogl.patterns.construccion.abstracfactoryswitch;

public class Charge extends InvoiceBase {
    InvoiceBase create() {
        return new Charge();
    }
}
