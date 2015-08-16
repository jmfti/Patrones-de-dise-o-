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
public class CipherSender implements ISender{
    
    public CipherSender(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void send(Socket socket, byte[] message) {
        System.out.println("patrones.comportamiento.Strategy.CipherSender.send() called");
        /*
         * encriptar y enviar
         */
    }

}
