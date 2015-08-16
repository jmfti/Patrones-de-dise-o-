/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.estructurales.adapter;

import java.util.Date;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class WSProxy implements IWSProxy{
    
    public WSProxy(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public String createIncident(int a, int b, int c, int d, int e, int f, int g, int h) {
        System.out.println("patrones.estructurales.adapter.WSProxy.createIncident() called");
        return "";
    }

    @Override
    public void setDateModified(int a, int b, int c, int d, int e, int f, Date dt) {
        System.out.println("patrones.estructurales.adapter.WSProxy.setDateModified() called");
    }

}
