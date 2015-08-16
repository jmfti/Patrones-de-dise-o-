/*
 * El patrón template podría considerarse como una extensión del patrón
 * Strategy.
 * Hacemos que el algoritmo pueda variar en tiempo de ejecución pero además
 * definimos una serie de operaciones predeterminadas que son comunes
 * a todos esos objetos que comparten dicha interfaz.
 * 
 */

package patrones.comportamiento.Template;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class CajeroTemplate implements Cajero{
    
    public CajeroTemplate(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public void retirar(int cantidad) {
        System.out.println("patrones.comportamiento.Template.CajeroTemplate.retirar() called");
        System.out.println("conectar a central");
        this.conectarCentral();
        System.out.println("comunicar retirada de efectivo de la cuenta y esperar respuesta");
        System.out.println("Mostrar respuesta y si procede expulsar billetes");
        this.mostrarPantalla(0);
    }

    @Override
    public void ingresar(int cantidad) {
        System.out.println("patrones.comportamiento.Template.CajeroTemplate.ingresar() called");
        System.out.println("conectar a central");
        this.conectarCentral();
        System.out.println("comunicar ingreso de efectivo de la cuenta y esperar respuesta");
        System.out.println("Mostrar respuesta y si procede imprimir comprobante");
        this.mostrarPantalla(1);
    }

    @Override
    public void conectarCentral() {
        System.out.println("patrones.comportamiento.Template.CajeroTemplate.conectarCentral() called");
    }

    @Override
    public void mostrarPantalla(int codigo) {
        System.out.println("patrones.comportamiento.Template.CajeroTemplate.mostrarPantalla() called");
    }

}
