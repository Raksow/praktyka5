package com.raksow;

public class Gracz
{
    Bronie weapon;
    Zbroja armor;
    int health;

    public Gracz(Bronie weapon, Zbroja armor, int health)
    {
        this.armor = armor;
        this.weapon = weapon;
        this.health = health;
    }
}
