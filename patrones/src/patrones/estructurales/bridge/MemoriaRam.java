/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.bridge;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class MemoriaRam implements IDispositivo{
    
    public MemoriaRam(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public byte[] leer(int dir, int bytes, int dispositivo) {
        System.out.println("patrones.estructurales.bridge.MemoriaRam.leer() called");
        return new byte[] {(byte)0x3a, (byte)0xf5, (byte)0xea};
    }

    @Override
    public void escribir(int dir, int bytesl, int dispositivo, byte[] cosas) {
        System.out.println("patrones.estructurales.bridge.MemoriaRam.escribir() called");
    }

}
