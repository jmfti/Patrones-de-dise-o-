/*
 * Este patron muchas veces lo que construye es un Composite.
 * Por ejemplo, para las conexiones a las bases de datos
 * son unas buenas candidatas para ser compuestas ya que 
 * usan un driver, cada una usara un usuario, una contraseña...
 */

package patrones.creacion.builder;

/**
 *
 * @author Xavier Mira Fernandez
 */
public abstract class ObjetoSQLBuilder {
    
    protected ObjetoSQL objeto;
    
    public ObjetoSQLBuilder(){
        
    }
    
    public abstract void setUser();
    
    public abstract void setPwd();
    
    public abstract void setDriver();
    
    public ObjetoSQL getObjeto(){
        return objeto;
    }
    
    public void buildObjeto(){
        objeto = new ObjetoSQL();
    }

}
