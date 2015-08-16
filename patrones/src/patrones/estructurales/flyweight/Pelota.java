/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.flyweight;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Pelota {
    
    private int x, y;
    /* private int color, radio;
     * lo comentamos para aplicar el patron flyweight. estas propiedades 
     * las definiremos en otra clase.
     */
    
    private PelotaFlyweight pf;
    /*
     * se podría hacer, tambien, mediante un Pool de objetos flyweight, 
     * o un objeto factory...
     */
    
    public Pelota(){
        /*
        * TODO : constructor
        */
    }

}
