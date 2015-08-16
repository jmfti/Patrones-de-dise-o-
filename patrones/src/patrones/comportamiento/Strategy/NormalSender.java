/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Strategy;

import java.net.Socket;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class NormalSender implements ISender{
    
    public NormalSender(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void send(Socket socket, byte[] message) {
        System.out.println("patrones.comportamiento.Strategy.NormalSender.send() called");
        /*
         * enviar sin cifrar
         */
    }

}
