/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.creacion.builder;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class CochesBD extends ObjetoSQLBuilder{
    
    public CochesBD(){
        buildObjeto();
        this.setUser();
        this.setPwd();
        this.setDriver();
    }

    @Override
    public void setUser() {
        System.out.println("patrones.creacion.builder.CochesBD.setUser() called");
        objeto.setUser("usuariocoches");
    }

    @Override
    public void setPwd() {
        System.out.println("patrones.creacion.builder.CochesBD.setPwd() called");
        objeto.setPwd("pwdcoches");
    }

    @Override
    public void setDriver() {
        System.out.println("patrones.creacion.builder.CochesBD.setDriver() called");
        objeto.setDriver("driver oracle");
    }

}
