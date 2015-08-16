/*
 * Singleton : Sirve para que no se pueda crear mas de 1 instancia
 * de una clase de la que no nos interesa que se puedan crear varios objetos
 */

package patrones.creacion.singleton;

import java.util.ArrayList;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class DBConnection implements DB{
    
    private static DBConnection singleton;
    
    private DBConnection(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public ArrayList<ArrayList<Object>> query(String query) {
        System.out.println("patrones.creacion.singleton.DBConnection.query() called");
        return null;
    }

    @Override
    public void insertCmd(String insert) {
        System.out.println("patrones.creacion.singleton.DBConnection.insertCmd() called");
        
    }
    
    public static DBConnection getInstance(){
        createInstance();
        return singleton;
    }
    
    private static void createInstance(){
        if (singleton == null) singleton = new DBConnection();
    }

}
