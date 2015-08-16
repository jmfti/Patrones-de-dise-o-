/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.decorator;

import patrones.estructurales.decorator.*;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        Componente com = new Componente();
        com.push(new Div().push(new Pargrphdecorator()));
        System.out.println(com.toHtml());
    }

}
