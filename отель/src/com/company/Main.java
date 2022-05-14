package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Register n1 = new Register();
        User n2 = new User();
        User n3 = new User();
        Room m1 = new Room();
        Room m2 = new Room();

        m1.setApartment(1);
        m1.setFloor(15);
        m1.setOccupant("owner1");

        m2.setApartment(2);
        m2.setFloor(15);
        m2.setOccupant("owner2");


        n2.setName("Anna");
        n2.setSurname("Fomina");
        n2.setAge(20);
        n2.setCity("Italy");



        n1.add_room(m1);
        n1.add_room(m2);


        n1.zasel(m1, n2);


        for (int a=0;a<n1.rooms.size();a++)
        {
            System.out.println(n1.rooms.get(a).getOccupant());
        }
        n1.del(m2);
        System.out.println("##########");
        for (int a=0;a<n1.rooms.size();a++) {
            System.out.println(n1.rooms.get(a).getApartment());
        }}
}
