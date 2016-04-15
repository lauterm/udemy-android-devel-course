package com.example;

/**
 * Created by lauterm on 4/14/2016.
 */
public class SuperSoldier extends Enemy {

    public SuperSoldier(int hitPoints, int lives) {
        super(hitPoints, lives);
    }

    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }

}
