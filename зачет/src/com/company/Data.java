package com.company;

import java.util.Scanner;

public class Data {
        public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		System.out.println ("Пожалуйста, введите год:");
    int year = sc.nextInt();
		 System.out.println ("Пожалуйста, введите месяц:");
    int month = sc.nextInt();
    int day = 0;           // Получить количество дней в году
    int days = 0;          // Получить количество дней в каждом месяце
    int befordays = 0;     // Получить количество дней до введенного месяца
    int today = 0;         // Получить все дни до

    boolean rui;
		if(year>=1900) {
        if(month>=1&&month<=12) {
            for(int y=1900;y<year;y++)
            {
                if(year%400==0||(year%4==0&&year%100!=0)) {
                    day +=366;
                }else {
                    day +=365;
                }
                //System.out.println(day);
            }
            if(year%400==0||(year%4==0&&year%100!=0)) {
                rui=true;
            }else {
                rui=false;
            }
            for(int i = 1;i<=month;i++) {
                switch(i) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 2:
                        if(rui=true){
                            days=29;
                        }else {
                            days=28;
                        }
                        break;
                    default:
                        days = 30;
                        break;
                }
                if(i<month) {
                    befordays+=days;
                }
            }
            today = day + befordays;
            int firstday;
            int temp = 1 + today%7;   //System.out.println(temp);
            if(temp==7) {
                firstday=0;
            }else {
                firstday=temp;
            }
            System.out.println ( "tMonday \\ tTuesday \\ tWednesday \\ tThursday \\ tFriday \\ tSaturday \\ tSunday");
            int count = 0; // Создать счетчик для подсчета количества пробелов до первого дня
            for(int z=0;z<firstday;z++) {
                System.out.print("\t");
                count++;
            }
            for(int i=1;i<=days;i++) {
                System.out.print(i+"\t");
                if((i+count)%7==0)
                    System.out.println();
            }
        }else {
            System.out.println ("Неверный месяц ввода!");
        }
    }else {
        System.out.println ("Год не запрошен");
    }
}
}