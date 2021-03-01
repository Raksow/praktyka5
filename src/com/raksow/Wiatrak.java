package com.raksow;

public class Wiatrak
{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak()
    {
        on = true;
        speed = SLOW;
        radius = 6;
        color = "Biały";
    }

    public Wiatrak(boolean on, int speed, int radius, String color)
    {
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public void Informacje()
    {
        String wlaczony;
        String szybkosc = null;
        if(on)
        {
            wlaczony = "Włączony";
        }
        else
        {
            wlaczony = "Wyłączony";
        }
        
        if(speed == SLOW)
        {
            szybkosc = "wolny";
        }
        else if(speed == MEDIUM)
        {
            szybkosc = "średni";
        }
        else if(speed == FAST)
        {
            szybkosc = "szybki";
        }
        
        if(on)
        {
            String info = "Wiatrak jest " +wlaczony+ ", jest ustawiony na tryb " +szybkosc+ ", średnica wiatraka wynosi " +radius * 2+ " cm i ma kolor " +color;
            System.out.println(info);
        }
        else
        {
            String info = "Wiatrak jest " +wlaczony+ " ma kolor " +color+ " a jego srednica wynosi " +radius * 2;
            System.out.println(info);
        }
    }
}
