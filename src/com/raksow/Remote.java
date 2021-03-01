package com.raksow;

public class Remote
{
    TV tv;

    Remote()
    {
        tv = new TV();
    }

    public void TurnTV(boolean turn)
    {
        if(turn == true)
        {
            tv.on = true;
            System.out.println("TV on");
        }
        else
        {
            tv.on = false;
            System.out.println("TV off");
        }
    }

    public void ChangeChannelUp()
    {
        if(tv.on == true && tv.channel < 20)
        {
            tv.channel++;
        }
    }

    public void ChangeChannelDown()
    {
        if(tv.on == true && tv.channel > 1)
        {
            tv.channel--;
        }
    }

    public void ChangeVolumeUp()
    {
        if(tv.on == true && tv.volume < 10)
        {
            tv.volume++;
        }
    }

    public void ChangeVolumeDown()
    {
        if(tv.on == true && tv.volume > 1)
        {
            tv.volume--;
        }
    }

    public void ShowVolume()
    {
        System.out.println("Volume = " + tv.volume);
    }

    public void ShowChannel()
    {
        System.out.println("Channel = " + tv.channel);
    }
}
