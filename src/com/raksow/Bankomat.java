package com.raksow;

import java.util.Scanner;

public class Bankomat
{
    Konto konto;

    public Bankomat(Konto konto)
    {
        this.konto = konto;
    }

    public void MainMenu()
    {
        int x;
        do
        {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw your money");
            System.out.println("3: deposit your money");
            System.out.println("4: EXIT");
            System.out.println("Enter a choice: ");

            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();

            switch (x)
            {
                case 1:
                    konto.ShowAccountValue();
                    break;
                case 2:
                    System.out.println("Ile chcesz wypłacić? ");
                    int a = scan.nextInt();
                    konto.WithdrawFunds(a);
                    break;
                case 3:
                    System.out.println("Ile chcesz wpłacić? ");
                    int b = scan.nextInt();
                    konto.DepositFunds(b);
                    break;
            }
        }while (x != 4);
    }
}
