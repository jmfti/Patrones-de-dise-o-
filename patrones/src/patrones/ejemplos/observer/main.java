/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.observer;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        
        Biblioteca biblio = new Biblioteca();
        Libro libro = new Libro();
        libro.add(biblio);
        libro.devolver(0);
        libro.prestar(0);
        
        ObjetoSingleton o = ObjetoSingleton.getInstance();
        System.out.println(o);
        System.out.println(o.getInstance());
        
        Object ob = (Object) o;
        System.out.println(ob.getClass().getName());
    }

}
