/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.sumastrategy;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class RealesSS implements SumadorStrategy{
    
    public RealesSS(){
        /*
        * TODO : constructor
        */
    }

    @Override
    public Object suma(Object a, Object b) {
        return (Object) ((Float)a + (Float) b);
    }

}
