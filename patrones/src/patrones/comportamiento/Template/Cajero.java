/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.Template;

/**
 *
 * @author Administrador
 */
public interface Cajero {
    public void retirar(int cantidad);
    public void ingresar(int cantidad);
    public void conectarCentral();
    public void mostrarPantalla(int codigo);
}
