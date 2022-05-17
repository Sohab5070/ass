package com.company;

public class Main {
    public static void main(String[] args) {
        Register n1 = new Register();
        n1.reg("Анастасия", "Qtwrs523");
        n1.reg("Сергей", "09pasd");
        n1.reg("Фаина", "TUP76sd");
        n1.reg("Алексей", "paY5276");
        n1.reg("Антон");
        n1.reg("Екатерина", "VBGH54");
        for (int i=0;i<n1.registered.size();i++)
        {
            System.out.println(n1.registered.get(i).getName());
        }
        n1.del("Алексей", "paY5276");
        System.out.println("##########");
        for (int i=0;i<n1.registered.size();i++){
            System.out.println(n1.registered.get(i).getName());
        }
    }

}
