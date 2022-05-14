package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
    ArrayList<Room> rooms = new ArrayList<>();
    private Room room;

    public boolean check(Room new_room) {
        boolean result = true;
        for (int a=0; a<rooms.size(); a++)
        {
            if (rooms.get(a).getApartment()==new_room.getApartment() && rooms.get(a).getFloor()==new_room.getFloor() )
            {
                result = false;
                return result;
            }
        }
            return result;
    }

    public void add_room(Room new_room) {
        if (check(new_room))
        {
            rooms.add(new_room);
        }
        else
        {
            System.out.println("Ошибка!");
        }
    }

    public void del(Room del_room) {
        for (int a=0; a<rooms.size(); a++)
        {
            if (rooms.get(a).getApartment()==(del_room.getApartment()))
            {
            rooms.remove(a);
            }
        }
    }

    public void zasel(Room room, User user)
    {

        if (room.getFree())
        {
            System.out.println(user.getName());
            room.setOccupant(user.getName());
            System.out.println(room.getOccupant());
            room.setFree(false);
        }
    }
    }
