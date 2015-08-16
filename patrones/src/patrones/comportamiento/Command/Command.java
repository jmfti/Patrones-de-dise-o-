/*
 * Lo que hacemos con este patrón, Command, es desacoplar el emisor de la orden
 * del receptor.
 * Además, también conseguimos encapsular órdenes en objetos que podemos manipular,
 * insertar en colas para ejecución concurrente, podemos usar el patrón Composite
 * para realizar órdenes que se compongan mediante otras órdenes...
 * En muchas ocasiones se pone en la interface el método redo y undo para permitir
 * deshacer/rehacer acciones
 */
package patrones.comportamiento.Command;

/**
 *
 * @author Administrador
 */
public interface Command {
    public void execute();
}
