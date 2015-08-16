/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.sumastrategy;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class EnterosSS implements SumadorStrategy{
    
    public EnterosSS(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public Object suma(Object a, Object b) {
        return (Object) ((Integer)a + (Integer) b);
    }

}
