/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.builder;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class ObjetoSQL {
    
    protected String user;
    protected String pwd;
    protected String driver;
    
    public ObjetoSQL(){
        user = "";
        pwd = "";
        driver = "";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
