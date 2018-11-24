package com.racsogl.patterns.estructuracion.adapter;

/**
 * Gestiona la creación y administra los documentos destinados a los clientes.
 *
 * Interfaz.
 */
public interface Documento {
    void setContenido(String contenido);
    void dibuja();
    void imprime();
}
