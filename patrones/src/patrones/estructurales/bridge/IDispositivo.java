/*
 * Representa la interfaz de un dispositivo hardware
 */
package patrones.estructurales.bridge;

/**
 *
 * @author Administrador
 */
public interface IDispositivo {
    
    public byte[] leer(int dir, int bytes, int dispositivo);
    public void escribir(int dir, int bytesl, int dispositivo, byte[] cosas);
    
}
