/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.builder;
import java.util.logging.Level;
import java.util.logging.Logger;
import patrones.creacion.builder.jpacont.*;
import patrones.creacion.builder.jpacont.exceptions.PreexistingEntityException;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class otromain {
    
    public otromain(){
        /*
        * TODO : constructor
        */
    }
    
    public static void main(String[] args){
        Product product = new Product(986710);
        System.out.println(product.toString());
        ProductJpaController jpac = new ProductJpaController();
        try {
            jpac.create(product);
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(otromain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(otromain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
