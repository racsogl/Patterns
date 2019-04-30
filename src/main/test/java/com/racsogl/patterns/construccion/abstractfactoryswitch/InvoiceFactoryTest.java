package com.racsogl.patterns.construccion.abstractfactoryswitch;

import com.racsogl.patterns.construccion.abstracfactoryswitch.*;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceFactoryTest {

    @Test
    public void testInvoiceFactory() throws Exception {
        InvoiceFactory invoiceFactory = new InvoiceFactoryImpl();
        final InvoiceBase invoice = invoiceFactory.cretateInvoice(InvoiceType.PAYMENT);

        Assert.assertTrue(invoice instanceof Payment);

    }
}
