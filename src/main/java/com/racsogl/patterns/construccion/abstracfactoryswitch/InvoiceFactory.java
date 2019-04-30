package com.racsogl.patterns.construccion.abstracfactoryswitch;

public interface InvoiceFactory {
    InvoiceBase cretateInvoice(InvoiceType invoiceType) throws InvoiceException;
}
