/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.Mediator;

/**
 *
 * @author Administrador
 */
public interface IInventario {
    public int[] getDisponibles();
    public void getTematica(int libroid);
    public void getAutor(int libroid);
    public void eliminarLibro(int libroid);
    public void anadirLibro(int libroid);
    public void registrarAlquiler(int libroid);
    public void setLibroNoDisponible(int libroid);
    public int getPrecioLibro(int libroid);
}
