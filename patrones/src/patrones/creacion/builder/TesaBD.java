/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.builder;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class TesaBD extends ObjetoSQLBuilder {
    
    public TesaBD(){
        buildObjeto();
        this.setUser();
        this.setPwd();
        this.setDriver();
    }

    @Override
    public void setUser() {
        System.out.println("patrones.creacion.builder.TesaBD.setUser() called");
        objeto.setDriver("usertesa");
    }

    @Override
    public void setPwd() {
        System.out.println("patrones.creacion.builder.TesaBD.setPwd() called");
        objeto.setPwd("pwdtesa");
    }

    @Override
    public void setDriver() {
        System.out.println("patrones.creacion.builder.TesaBD.setDriver() called");
        objeto.setUser("mysql");
    }

}
