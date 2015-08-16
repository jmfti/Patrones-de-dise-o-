/*
 * para aprovechar todavia mejor las ventajas que nos proporciona
 * el patron Proxy podriamos combinarlo, en este caso, con el patron Singleton
 * de forma que no se tengan que realizar las tareas pesadas una y otra vez
 * cada vez que creamos un nuevo Proxy.
 * 
 * De esa forma, el proxy llamaría a WebService.getInstance() y obtendría siempre
 * el mismo objeto.
 */

package patrones.estructurales.proxy;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class WebService {
    
    public WebService(){
        /*
        * hacer conexiones y tareas pesadas
        */
        System.out.println("WebService : realizando tareas pesadas");
    }
    
    public String metodo1(){
        /*
         * realizar tareas pesadas
         */
        return "";
    }

}
