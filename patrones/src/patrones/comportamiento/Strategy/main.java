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
public class main {
    
    public static void main(String[] args){
        /*
        * TODO : constructor
        */
        ConexionTCP con = new ConexionTCP();
        Socket sock = new Socket();
        byte[] data = new byte[100];
        con.send(sock, data);
        con.toggle();
        con.send(sock, data);
    }

}
