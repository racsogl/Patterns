package com.racsogl.patterns.construccion.abstracfactoryswitch;

public class InvoiceFactoryImpl implements InvoiceFactory {
    public InvoiceBase cretateInvoice(InvoiceType invoiceType) throws InvoiceException {
        switch (invoiceType) {
            case INVOICE:
                return new Invoice().create();
            case CHARGE:
                return new Charge().create();
            case PAYMENT:
                return new Payment().create();
            default:
                throw new InvoiceException();
        }
    }
}
