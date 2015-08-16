/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.ejemplos.sumastrategy;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Sumador {
    
    SumadorStrategy estrategiasuma;
    
    public Sumador(){
        /*
        * TODO : constructor
        */
        estrategiasuma = new EnterosSS();
    }
    
    public void setEstrategia(SumadorStrategy ss){
        estrategiasuma = ss;
    }
    
    public Object sumar(Object a, Object b){
        return estrategiasuma.suma(a, b);
    }

}
