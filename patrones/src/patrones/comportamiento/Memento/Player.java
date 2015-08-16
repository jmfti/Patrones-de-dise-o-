/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Memento;

import java.util.ArrayList;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Player implements Memento{
    
    private PlayerData pd;
    
    private ArrayList<PlayerData> states;
    
    public Player(){
        pd = new PlayerData();
        states = new ArrayList<PlayerData>();
        
    }
    
    public void test(){
        screenshot();
        System.out.println(pd.toString());
        pd.setHealth(245);
        pd.setPosx(1);
        pd.setPosy(2);
        pd.setVel(-1);
        System.out.println(pd.toString());
        restoreState(0);
        System.out.println(pd.toString());
    }

    @Override
    public void screenshot() {
        System.out.println("patrones.comportamiento.Memento.Player.screenshot() called");
        states.add(pd.clone());
    }

    @Override
    public void restoreState(int state) {
        System.out.println("patrones.comportamiento.Memento.Player.restoreState() called");
        if (state <= states.size())
            pd = states.get(state);
        
    }

}
