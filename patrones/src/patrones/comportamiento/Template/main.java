/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Template;

import java.io.PrintWriter;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        CajeroTemplate plantilla = new CajeroTemplate();
        plantilla.ingresar(1000);
        plantilla.retirar(1000);
        CajeroBBVA cajbbva = new CajeroBBVA();
        cajbbva.ingresar(1000);
        cajbbva.retirar(1000);
        PrintWriter pw = new PrintWriter(System.out);
        
    }

}
