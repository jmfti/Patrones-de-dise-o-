/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.comportamiento.Memento;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class PlayerData {

    @Override
    public String toString() {
        return "PlayerData{" + "posx=" + posx + ", posy=" + posy + ", vel=" + vel + ", health=" + health + '}';
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        
    }
    
    private int posx, posy, vel;
    private int health;
    
    public PlayerData(){
        /*
        * TODO : constructor
        */
        posx = 100;
        posy = 120;
        vel = 101;
        health= 200;
    }
    
    @Override
    public PlayerData clone(){
        PlayerData pd = new PlayerData();
        pd.health = health;
        pd.posx = posx;
        pd.posy = posy;
        pd.vel = vel;
        return pd;
    }

}
