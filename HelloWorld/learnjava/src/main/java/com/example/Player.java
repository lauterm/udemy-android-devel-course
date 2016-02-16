package com.example;

/**
 * Created by lauterm on 2/15/2016.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player(){
        handleName = "Unknown player";
        setLives(3);
        setLevel(1);
        setScore(0);
        setDefaultWeapon();
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public Player(String handle){
        this();
        setHandleName(handle);
    }

    public Player(String handle, int level){
        this();
        setHandleName(handle);
        setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getHandleName() {
        return handleName;
    }
    public void setHandleName(String handle) {
        if (handle.length() < 3)
            return;
        this.handleName = handle;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
