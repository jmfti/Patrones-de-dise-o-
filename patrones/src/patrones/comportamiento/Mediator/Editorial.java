/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Mediator;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Editorial implements IEditorial{
    
    public Editorial(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void registrarVenta(int idlibro) {
        System.out.println("patrones.comportamiento.Mediator.Editorial.registrarVenta() called");
    }

    @Override
    public void registrarAlquiler(int idlibro) {
        System.out.println("patrones.comportamiento.Mediator.Editorial.registrarAlquiler() called");
    }

    @Override
    public void hacerPedido(int[] librosids) {
        System.out.println("patrones.comportamiento.Mediator.Editorial.hacerPedido() called");
    }

    @Override
    public int[] getBestSellers() {
        System.out.println("patrones.comportamiento.Mediator.Editorial.getBestSellers() called");
        return null;
    }

    @Override
    public int[][] getPVPRecomendados() {
        System.out.println("patrones.comportamiento.Mediator.Editorial.getPVPRecomendados() called");
        return null;
    }

}
