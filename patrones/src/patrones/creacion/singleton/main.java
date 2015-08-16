/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.singleton;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        DBConnection db = DBConnection.getInstance();
        System.out.println(db.getInstance().toString());
        System.out.println(db.getInstance().toString());
    }

}
