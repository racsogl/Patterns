package com.racsogl.patterns.construccion.builder;

public class DocumentacionHtml extends Documentacion {

    public void agregaDocumento(final String documento) {
        if (documento.startsWith("<HTML>")) {
            contenido.add(documento);
        }
    }

    public void imprime() {
        System.out.println("Documentacion HTML");
        for (final String string : contenido)
            System.out.println(string);
    }
}
