package com.company;

import java.util.ArrayList;

public class Time {

    public static void okloc(){

    ArrayList<String> time = new ArrayList<String>();
    time.add(1,"07:20");
    time.add(2,"10:00");
    time.add(3,"15:30");
    time.add(4,"20:59");
        System.out.println(time.get(1));

        System.out.printf("ArrayList has %d elements \n", time.size());
        for(String T : time){

            System.out.println(T);
        }                  // проверяем наличие элемента
        if(time.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }
        Object[] peopleArray = time.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }

    }

    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

}
