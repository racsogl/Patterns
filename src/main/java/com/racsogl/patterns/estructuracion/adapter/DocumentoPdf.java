package com.racsogl.patterns.estructuracion.adapter;

/**
 * Representa el adaptador.
 * <p>
 * Se asocia a la clase ComponentePdf mediente el atributo herramientaPdf que se asocia al
 * al objeto adaptado.
 * <p>
 * Implementa la interfaz {@link Documento} y cada una de sus métodos.
 * Invoca a los métodos necesarios del objeto adaptado {@link ComponentePdf}
 * para realizar la adaptación entre ambas interfaces.
 * <p>
 * Implementa los métodos de la interfaz{@link Documento} invocando a los métodos
 * del objeto adaptado{@link ComponentePdf}
 */
public class DocumentoPdf implements Documento {

    protected ComponentePdf herramientaPdf = new ComponentePdf();

    public void setContenido(String contenido) {
        herramientaPdf.pdfFijaContenido(contenido);
    }

    public void dibuja() {
        herramientaPdf.pdfPreparaVisualizacion();
        herramientaPdf.pdfRefresca();
        herramientaPdf.pdfFinalizaVisualizacion();
    }

    public void imprime() {
        herramientaPdf.pdfEnviaImpresora();
    }
}
