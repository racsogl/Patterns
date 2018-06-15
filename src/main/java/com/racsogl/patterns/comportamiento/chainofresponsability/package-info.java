/**
 * Construye una cadena de objetos tal que si un objeto no puede responder a una solicitud, puede transmitirla a su
 * sucesor y así sucesivamente hasta que uno de la cadena responde.
 *
 * Dominio de aplicación
 *  Una cadena de objetos gestiona una solicitud según un orden que se define dinámicamente.
 *  La forma en que una cadena de objetos gestiona una solicitud no tiene por qué conocerse en sus clientes.
 */
package com.racsogl.patterns.comportamiento.chainofresponsability;