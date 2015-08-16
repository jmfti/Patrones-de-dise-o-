/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacion.abstractfactory;

/**
 * Proporciona una interfaz para crear FAMILIAS DE OBJETOS relacionados o que 
 * dependen entre sí, sin especificar sus clases concretas
 * @author Administrador
 */
public interface IFabricaCoches {
    public void fabricaCoche();
    
    public void fabricaPuerta();
    
    public void fabricaVentana();
    
    public void fabricaMotor();
}
