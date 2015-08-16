/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.Mediator;

/**
 *
 * @author Administrador
 */
public interface IEditorial {
    public void registrarVenta(int idlibro);
    public void registrarAlquiler(int idlibro);
    public void hacerPedido(int[] librosids);
    public int[] getBestSellers();
    public int[][] getPVPRecomendados();
}
