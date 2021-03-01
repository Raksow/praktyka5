package com.raksow;

import java.util.Scanner;

public class Zadanie5
{
    public static void main(String[] args)
    {
        Konto tab[] = new Konto[10];

        for(int i = 0; i < 10; i++)
        {
            tab[i] = new Konto(i, 100);
        }

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj numer konta: ");
            int x = scan.nextInt();
            Bankomat konta = new Bankomat(tab[x]);

            konta.MainMenu();
        }while (true);
    }
}
