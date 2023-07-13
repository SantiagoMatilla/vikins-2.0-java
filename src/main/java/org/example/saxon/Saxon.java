package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public int attack(){
        return this.strength;
    }

    public void receiveDamage(int damage){
        this.health -= damage;
        if(health > 0){
            this.msg = "A Saxon has received " + damage + " points of damage";
        }else{
            this.msg ="A Saxon has died in combat";
        }
    }

    public String getMsg() {
        return msg;
    }
}
