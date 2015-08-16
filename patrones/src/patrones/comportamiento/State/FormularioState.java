/*
 * Con el patrón State lo que conseguimos es que un objeto se comporte
 * de forma distinta según su estado interno.
 * En un juego podríamos definir que un estado de power-up implique que el
 * jugador, cuando hay que llamar a move(), se haga a una velocidad aumentada
 * por ejemplo.
 * En el siguiente ejemplo lo que hacemos es una cadena de formularios típica.
 * Es decir, cubres un formulario, por ejemplo, con datos personales y al darle
 * a siguiente hay que cubrir otro formulario con otros datos.
 * 
 */
package patrones.comportamiento.State;

/**
 *
 * @author Administrador
 */
public interface FormularioState {
    public void mostrarFormulario();
    public void enviarFormulario();
    public FormularioState nextState();
    public FormularioState lastState();
}
