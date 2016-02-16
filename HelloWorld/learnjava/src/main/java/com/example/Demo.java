package com.example;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Timothy", 5);
        System.out.println(tim.getHandleName());
        System.out.println(tim.getWeapon().getName());
    }
}
