/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Memento;

import java.util.concurrent.Callable;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        Player player = new Player();
        player.test();
        Callable p = () -> {
            System.out.println("olakase");
        };
    }

}
