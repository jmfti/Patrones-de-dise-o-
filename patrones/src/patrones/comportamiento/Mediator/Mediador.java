/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Mediator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Mediador implements IMediador{
    
    private Cajero cajero;
    private Editorial editorial;
    private Inventario inventario;
    
    public Mediador(){
        /*
        * TODO : constructor
        */
        cajero = new Cajero();
        editorial = new Editorial();
        inventario = new Inventario();
    }

    @Override
    public void getLibrosDisponibles() {
        System.out.println("patrones.comportamiento.Mediator.Mediador.getLibrosDisponibles() called");
        inventario.getDisponibles();
    }

    @Override
    public void cobrarLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.cobrarLibro() called");
        int cantidad = inventario.getPrecioLibro(libroid);
        cajero.cobrarCantidad(cantidad);
    }

    @Override
    public void comprarLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.comprarLibro() called");
        cobrarLibro(libroid);
        inventario.eliminarLibro(libroid);
        editorial.registrarVenta(libroid);
        
    }

    @Override
    public void alquilarLibro(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.alquilarLibro() called");
        inventario.registrarAlquiler(libroid);
        editorial.registrarAlquiler(libroid);
        
    }

    @Override
    public void registraCambioInventario(int libroid, boolean salida) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.registraCambioInventario() called");
        
    }

    @Override
    public void enviarDatosVentaEditorial(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.enviarDatosVentaEditorial() called");
        
    }

    @Override
    public void enviarDatosAlquilerEditorial(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.enviarDatosAlquilerEditorial() called");
    }

    @Override
    public void cobrarAlquiler(int libroid) {
        System.out.println("patrones.comportamiento.Mediator.Mediador.cobrarAlquiler() called");
        inventario.getPrecioLibro(libroid);
        int cantidad = 110/31;
        cajero.cobrarCantidad(cantidad);
    }

}
