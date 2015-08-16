/*
 * Con el patrón Strategy lo que conseguimos es encapsular un algoritmo y
 * variarlo en tiempo de ejecución.
 * Por ejemplo, si queremos enviar datos a una conexión establecida podría 
 * interesarnos poder elegir entre enviarlos cifrados en AES o sin cifrar.
 * Sin embargo no nos interesa usar condicionales o usar objetos distintos.
 * 
 * Para ello creamos la interface ISender, que define el método send.
 * Luego crearemos 2 clases, una clase para enviar los datos sin cifrar
 * y otra para enviar los datos cifrados. Hacemos que implementen esta 
 * interface.
 * 
 * Luego en el objeto de la conexion simplemente podríamos hacer toggle para
 * cambiar entre cifrado/descifrado 
 */
package patrones.comportamiento.Strategy;

import java.net.Socket;

/**
 *
 * @author Administrador
 */
public interface ISender {
    public void send(Socket socket, byte[] message);
}
