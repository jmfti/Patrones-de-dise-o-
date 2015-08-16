/*
 * como el patron Proxy lo que hace es controlar EL ACCESO a la clase 
 * real (sujeto real) podemos, por ejemplo, cargar el objeto real solo cuando
 * se vaya a utilizar
 */

package patrones.estructurales.proxy;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class WebServiceProxy {
    
    private WebService ws;
    
    public WebServiceProxy(){
        /*
        * TODO : constructor
        */
    }
    
    public String metodo1(){
        if (ws == null) ws = new WebService();
        return ws.metodo1();
    }

}
