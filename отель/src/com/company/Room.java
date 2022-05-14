package com.company;

public class Room {
    private String occupant;
    private boolean free=true;
    private int floor;
    private int apartment;


    public String getOccupant() {
        return this.occupant;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getApartment() {
        return this.apartment;
    }

    public boolean getFree() {return this.free;}


    public void setOccupant(String set_occupant) {
        this.occupant = set_occupant;
    }

    public void setFloor(int set_floor) {
        this.floor = set_floor;
    }

    public void setApartment(int set_apartment) {
        this.apartment = set_apartment;
    }

    public void setFree(boolean set_free){this.free = free;}
}
