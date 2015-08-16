/*
 * Con el patrón Mediador lo que conseguimos es reducir el acoplamiento
 * haciendo que distintas clases o módulos no se hagan referencia de forma explícita.
 * Cuando aparecen muchas interconexiones entre varias clases o módulos es 
 * conveniente incluir un mediador que defina como interactúan entre ellas.
 * 
 * En este ejemplo consideraremos una librería que ha de interactuar con un 
 * sistema de la editorial, un cajero y el inventario de la biblioteca.
 */
package patrones.comportamiento.Mediator;

/**
 *
 * @author Administrador
 */
public interface IMediador {
    public void getLibrosDisponibles();
    public void cobrarLibro(int libroid);
    public void comprarLibro(int libroid);
    public void alquilarLibro(int libroid);
    public void registraCambioInventario(int libroid, boolean salida);
    public void enviarDatosVentaEditorial(int libroid);
    public void enviarDatosAlquilerEditorial(int libroid);
    public void cobrarAlquiler(int libroid);
}
