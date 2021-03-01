package com.raksow;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Zadanie6
{
    public static void main(String[] args) throws InterruptedException {
        Bronie miecz = new Bronie(3);
        Bronie topor = new Bronie(4);
        Bronie halabarda = new Bronie(4);
        Bronie luk = new Bronie(3);
        Bronie bronDlaGracza;

        Zbroja wikingow = new Zbroja(2);
        Zbroja rycerska = new Zbroja(1);
        Zbroja samurajska = new Zbroja(2);
        Zbroja kowalska = new Zbroja(1);
        Zbroja zbrojaDlaGracza;

        Przeciwnik wiking = new Przeciwnik(topor, wikingow, 15);
        Przeciwnik rycerz = new Przeciwnik(miecz, rycerska, 15);
        Przeciwnik lucznik = new Przeciwnik(luk, kowalska, 15);
        Przeciwnik samuraj = new Przeciwnik(halabarda, samurajska, 15);
        Przeciwnik halabardownik = new Przeciwnik(halabarda, wikingow, 15);
        Przeciwnik przeciwnikDlaGracza;

        Scanner scan = new Scanner(System.in);
        System.out.println("1: miecz");
        System.out.println("2: topór");
        System.out.println("3: halabarda");
        System.out.println("4: łuk");
        System.out.println("Podaj jaką chcesz broń: ");
        int x = scan.nextInt();

        switch (x){
            case 1:
                bronDlaGracza = miecz;
                break;
            case 2:
                bronDlaGracza = topor;
                break;
            case 3:
                bronDlaGracza = halabarda;
                break;
            case 4:
                bronDlaGracza = luk;
                break;
            default:
                bronDlaGracza = miecz;
                break;
        }

        System.out.println("1: wikingów");
        System.out.println("2: rycerską");
        System.out.println("3: samurajską");
        System.out.println("4: kowalską");
        System.out.println("Podaj jaką chcesz zbroje: ");
        int y = scan.nextInt();

        switch (y){
            case 1:
                zbrojaDlaGracza = wikingow;
                break;
            case 2:
                zbrojaDlaGracza = rycerska;
                break;
            case 3:
                zbrojaDlaGracza = samurajska;
                break;
            case 4:
                zbrojaDlaGracza = kowalska;
                break;
            default:
                zbrojaDlaGracza = rycerska;
                break;
        }

        System.out.println("1: wikinga");
        System.out.println("2: rycerza");
        System.out.println("3: łucznika");
        System.out.println("4: samuraja");
        System.out.println("5: halabardownika");
        System.out.println("Podaj jakiego chcesz przeciwnika: ");
        int z = scan.nextInt();

        switch (z){
            case 1:
                przeciwnikDlaGracza = wiking;
                break;
            case 2:
                przeciwnikDlaGracza = rycerz;
                break;
            case 3:
                przeciwnikDlaGracza = lucznik;
                break;
            case 4:
                przeciwnikDlaGracza = samuraj;
                break;
            case 5:
                przeciwnikDlaGracza = halabardownik;
                break;
            default:
                przeciwnikDlaGracza = rycerz;
                break;
        }

        Gracz Ja = new Gracz(bronDlaGracza, zbrojaDlaGracza, 15);

        do{
            przeciwnikDlaGracza.health -= Ja.weapon.Damage - przeciwnikDlaGracza.armor.Protection;
            if(przeciwnikDlaGracza.health > 0)
            {
                Ja.health -= przeciwnikDlaGracza.weapon.Damage - Ja.armor.Protection;
            }
            System.out.println("Gracz ma:" +Ja.health+ " hp\nPrzeciwnik ma: "+przeciwnikDlaGracza.health+ " hp");
            Thread.sleep(3000);
        }while(Ja.health > 0 && przeciwnikDlaGracza.health > 0);

        if(Ja.health > 0)
        {
            System.out.println("Wygrał gracz");
        }
        else
        {
            System.out.println("Przeciwnik wygrał oszukując");
        }
    }
}
