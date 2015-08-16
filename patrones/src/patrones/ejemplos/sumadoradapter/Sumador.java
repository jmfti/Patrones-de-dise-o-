/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.sumadoradapter;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Sumador {
    
    SumadorEnteros se;
    SumadorReales sr;
    
    public Sumador(){
        /*
        * TODO : constructor
        */
        se = new SumadorEnteros();
        sr = new SumadorReales();
    }
    
    public Object suma(Object a, Object b){
        if (a.getClass().getName().equals("Integer"))
            return se.sumar((Integer)a, (Integer)b);
        else 
            return sr.suma((Float)a, (Float)b);
    }

}
