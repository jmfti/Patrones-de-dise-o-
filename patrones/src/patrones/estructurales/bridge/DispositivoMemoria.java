/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.bridge;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class DispositivoMemoria {
    
    private DiscoDuro d1;
    private MemoriaRam ram;
    
    public DispositivoMemoria(){
        ram = new MemoriaRam();
        d1 = new DiscoDuro();
    }
    
    public byte[] leerDeMemoria(int dir, int len){
        /*
         * si el bloque no está en la RAM lo traemos a la ram
         */
        if (ram.leer(dir, len, 0) == null)
            ram.escribir(dir, len, 0, d1.leer(dir, len, 0));
        return ram.leer(dir, len, 0);
    }

}
