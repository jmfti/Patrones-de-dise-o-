/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.builder;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Director {
    
    protected ObjetoSQLBuilder builder;
    
    public Director(){
        builder = new TesaBD();
        if (1 == 1)
            builder = new CochesBD();
    }

}
