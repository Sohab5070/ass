package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @org.junit.jupiter.api.Test
    void check() {
    }

    @org.junit.jupiter.api.Test
    public void addTest() {
        Register num = new Register();
        Room tenant1 = new Room();
        tenant1.setOccupant("owner1");

        tenant1.setApartment(1);

        tenant1.setFloor(15);

        num.add_room(tenant1);

        Room tenant2 = new Room();
        tenant2.setOccupant("owner2");

        tenant2.setFloor(15);

        tenant2.setApartment(2);

        num.add_room(tenant2);

        Assertions.assertEquals(true,num.check(tenant2));
    }

    @org.junit.jupiter.api.Test
    public void delTest() {
        Register num = new Register();
        Room tenant2 = new Room();

        tenant2.setOccupant("owner2");

        tenant2.setFloor(15);

        tenant2.setApartment(2);

        num.add_room(tenant2);

        num.del(tenant2);

        Assertions.assertEquals(0,num.rooms.size());
    }
    }