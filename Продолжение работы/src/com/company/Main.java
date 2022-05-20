package com.company;


import java.util.Scanner;

public class Main {

    private static String String_text;

    public static void main(String[] args) {
            Register n1 = new Register();
            n1.reg("Анастасия", "Qtwrs523");
            n1.reg("Сергей", "09pasd");
            n1.reg("Екатерина", "VBGH54");
            for (int i = 0; i < n1.registered.size(); i++) {
                System.out.println(n1.registered.get(i).getName());
            }
            n1.del("Екатерина", "VBGH54");
            System.out.println("##########");
            for (int i = 0; i < n1.registered.size(); i++) {
                System.out.println(n1.registered.get(i).getName());
            }

        Scanner vvod = new Scanner(System.in);
        String String_text_text;

        System.out.print("Написать комментарий: ");
        String_text = vvod.next();
        System.out.print("Ваш комментарий: " + String_text);
        }

    }