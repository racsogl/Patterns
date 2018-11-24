/**
 * El objetivo de los patrones de estructuración es facilitar la independencia
 * de la interfaz de un objeto o de un conjunto de objetos respecto de su implementación.
 * <p>
 * En el caso de un conjunto de objetos, se trata también de hacer que esta interfaz sea independiente
 * de la jerarquía de clases y de la composición de los objetos.
 * <p>
 * Proporcionando interfaces, los patrones de estructuración encapsulan la composición de objetos,
 * aumentan el nivel de abstracción del sistema de forma similar a como los patrones
 * de creación encapsulan la creación de objetos. Los patrones de estructuración ponen de relieve
 * las interfaces.
 * <p>
 * La encapsulación de la composición no se realiza estructurando el objeto en sí mismo
 * sino transfiriendo esta estructuración a un segundo objeto.
 * Éste queda íntimamente ligado al primero.
 * Esta transferencia de estructuración significa que el primer objeto posee la interfaz de cara
 * a los clientes y administra la relación con el segundo objeto que gestiona la composición
 * y no tiene ninguna interfaz con los clientes externos.
 * <p>
 * Esta realización ofrece otra mejora que es la flexibilidad en la composición,
 * la cual puede modificarse de manera dinámica. En efecto, es sencillo sustituir un objeto
 * por otro siempre que sea de la misma clase o que respete la misma interfaz.
 * Los patrones Composite, Decorator y Bridge son un buen ejemplo de este mecanismo.
 */
package com.racsogl.patterns.estructuracion;