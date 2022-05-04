package com.company;

import java.util.ArrayList;

public class Register {
    ArrayList<User> registered =new ArrayList<>();

    public void reg(String name,String pass)
    {
        User new_user= new User();
        new_user.setPassword(pass);
        new_user.setName(name);
        registered.add(new_user);


    }
    public void reg(String name)
    {
        String pass ="";
        String poss="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        poss.charAt(3);
    }
    public void del(String name,String pass)
    {

        //registered.add(reg);
        registered.remove(1);
        System.out.println(registered.stream().toArray());
    }
}
