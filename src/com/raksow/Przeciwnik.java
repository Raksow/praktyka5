package com.raksow;

public class Przeciwnik
{
    Bronie weapon;
    Zbroja armor;
    int health;

    public Przeciwnik(Bronie weapon, Zbroja armor, int health)
    {
        this.armor = armor;
        this.weapon = weapon;
        this.health = health;
    }
}
