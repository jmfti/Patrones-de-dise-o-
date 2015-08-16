/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Mediator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Inventario implements IInventario{
    
    public Inventario(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public int[] getDisponibles() {
        System.out.println("patrones.comportamiento.Mediator.Inventario.getDisponibles() called");
        return null;
    }

    @Override
    public void getTematica(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.getTematica() called");
    }

    @Override
    public void getAutor(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.getAutor() called");
    }

    @Override
    public void eliminarLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.eliminarLibro() called");
    }

    @Override
    public void registrarAlquiler(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.registrarAlquiler() called");
    }

    @Override
    public void setLibroNoDisponible(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.setLibroNoDisponible() called");
    }

    @Override
    public int getPrecioLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.getPrecioLibro() called");
        return 110;
    }

    @Override
    public void anadirLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Inventario.anadirLibro() called");
    }
    
    

}
