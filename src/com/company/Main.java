package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        createHeroes();
        boss.getHealth();
        boss.getDamage();
        boss.getTypeProtection();
        boss.setHealth(650);
        boss.setDamage(20);
        boss.setTypeProtection("Magical");
        System.out.println(boss);
    }
    public static void createHeroes(){
        Hero boy = new Hero(250, 15, "Run");
        Hero floor = new Hero(150, 8, "Fly");
        Hero mal = new Hero(300,8);
        int[] array = {0, 1, 2};
        return;
    }

}



