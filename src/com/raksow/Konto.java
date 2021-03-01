package com.raksow;

public class Konto
{
    int id;
    int accountValue;

    public Konto(int id, int accountValue)
    {
        this.id = id;
        this.accountValue = accountValue;
    }

    public void ShowAccountValue()
    {
        System.out.println(accountValue);
    }

    public void WithdrawFunds(int value)
    {
        accountValue -= value;
    }

    public void DepositFunds(int value)
    {
        accountValue += value;
    }


}
