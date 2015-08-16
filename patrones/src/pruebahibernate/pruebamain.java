/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class pruebamain {
    
    public pruebamain(){
        /*
        * TODO : constructor
        */
    }
    
    public static void main (String[] args){
        Cliente cli = new Cliente("Ruperez");
        ClienteJpaController jpacli = new ClienteJpaController();
        cli = jpacli.findCliente("Abril");
        System.out.println(cli.toString());
    }

}
