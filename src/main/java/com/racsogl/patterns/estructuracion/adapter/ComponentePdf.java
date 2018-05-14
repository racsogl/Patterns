package com.racsogl.patterns.estructuracion.adapter;

/**
 * Representa un componente que se quiere integrar en la app.
 * <p>
 * Su diseño es independiente de la app y, en particular, de la interfaz Documento.
 * <p>
 * Esta clase tendra que adaptarse.
 */
public class ComponentePdf {
    protected String contenido;

    public void pdfFijaContenido(String contenido) {
        this.contenido = contenido;
    }

    public void pdfPreparaVisualizacion() {
        System.out.println("Visualiza PDF: Comienzo");
    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " +
                contenido);
    }

    public void pdfFinalizaVisualizacion() {
        System.out.println("Visualiza PDF: Fin");
    }

    public void pdfEnviaImpresora() {
        System.out.println("Impresión PDF: " + contenido);
    }
}
