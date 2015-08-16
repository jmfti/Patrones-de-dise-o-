/*
 * El patrón memento sirve para tomar una instantánea de un objeto y 
 * recordar su estado, por si queremos restaurarlo, por ejemplo.
 * Pongamos que tenemos un sistema de físicas de un juego, por ejemplo, 
 * y como tenemos una latencia (alrededor de 70ms) y queremos que en la pantalla
 * del jugador no tenga que adelantarse al estado del contrario, podríamos recordar 
 * las últimas 20 posiciones del jugador.
 */
package patrones.comportamiento.Memento;

/**
 *
 * @author Administrador
 */
public interface Memento {
    public void screenshot();
    public void restoreState(int state);
}
