package com.raksow;

public class Zadanie3
{

    public static void main(String[] args)
    {
        Remote pilot = new Remote();

        pilot.TurnTV(true);

        pilot.ChangeChannelUp();
        pilot.ChangeChannelUp();
        pilot.ChangeChannelUp();

        pilot.ShowChannel();

        pilot.ChangeChannelDown();

        pilot.ShowChannel();

        pilot.ChangeVolumeUp();
        pilot.ChangeVolumeUp();
        pilot.ChangeVolumeUp();
        pilot.ChangeVolumeUp();
        pilot.ChangeVolumeUp();

        pilot.ShowVolume();

        pilot.ChangeVolumeDown();
        pilot.ChangeVolumeDown();

        pilot.ShowVolume();

        pilot.TurnTV(false);
    }
}
