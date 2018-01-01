package com.gab12;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name="Adam";
        player.health=20;
        player.weapon="sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.remainingHealth());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.remainingHealth());


    }
}
