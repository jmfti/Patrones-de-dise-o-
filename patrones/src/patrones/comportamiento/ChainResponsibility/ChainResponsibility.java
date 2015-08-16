/*
 * Con el patrón Chain of Responsibility lo que conseguimos es desacoplar
 * al receptor del emisor.
 * Esto, lo que nos permite, es que ante un evento específico puedan responder 
 * varios objetos siguiendo una cadena de responsabilidad.
 * Podríamos verlo como el método de gestión del BUS por prioridades.
 * Surge un evento, que el más prioritario puede o quiere atenderlo? => lo atiende
 * Si no puede o no quiere atenderlo (o no es su responsabilidad), lo pasa
 * por la cadena de responsabilidad hacia adelante.
 */
package patrones.comportamiento.ChainResponsibility;

/**
 *
 * @author Administrador
 */
public interface ChainResponsibility {
    public int accion(String cadena);
}
