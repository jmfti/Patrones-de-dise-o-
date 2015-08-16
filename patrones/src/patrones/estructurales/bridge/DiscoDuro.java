/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.bridge;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class DiscoDuro implements IDispositivo{
    
    public DiscoDuro(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public byte[] leer(int dir, int bytes, int dispositivo) {
        System.out.println("patrones.estructurales.bridge.DiscoDuro.leer() called");
        return new byte[] {(byte)0x3f, (byte)0x25, (byte)0xff};
    }

    @Override
    public void escribir(int dir, int bytesl, int dispositivo, byte[] cosas) {
        System.out.println("patrones.estructurales.bridge.DiscoDuro.escribir() called");
    }

}
