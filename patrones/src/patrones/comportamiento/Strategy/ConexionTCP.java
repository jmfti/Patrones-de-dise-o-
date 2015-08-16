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
public class ConexionTCP {
    
    private ISender sender;
    private boolean cipher;
    
    public ConexionTCP(){
        /*
        * TODO : constructor
        */
        cipher = false;
        sender = new NormalSender();
    }
    
    public void toggle(){
        cipher = !cipher;
        if (cipher)
            sender = new CipherSender();
        else
            sender = new NormalSender();
    }
    
    public void send(Socket s, byte[] data){
        sender.send(s, data);
    }

}
