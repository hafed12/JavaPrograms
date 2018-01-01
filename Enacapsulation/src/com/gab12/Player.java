package com.gab12;

/**
 * Created by SONY on 10/25/2017.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health=health - damage;
        if(this.health <=0 ){
            System.out.println("Player knocked out");
        }
    }

    public int remainingHealth(){
        return this.health;
    }
}
