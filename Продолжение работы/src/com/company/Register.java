package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Register {
    ArrayList<User> registered = new ArrayList();

    public Register() {
    }

    public void reg(String name, String pass) {
        User new_user = new User();
        new_user.setPass(pass);
        new_user.setName(name);
        this.registered.add(new_user);
    }

    public void reg (String name){

        String pass = "";
        String poss = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        poss.charAt(5);
        for (int i = 0; i < 10; i++) {
            pass += poss.charAt((int) ((Math.random() * (poss.length() - 0)) + 0));
        }
        User new_user = new User();
        new_user.setPass(pass);
        new_user.setName(name);
        this.registered.add(new_user);
    }


    public void del(String name, String pass)
    {
        for (int i = 0; i < registered.size(); i++)
        {
            if (registered.get(i).getName().equals(name) && registered.get(i).getPass().equals(pass))
            {
                registered.remove(i);
            }
        }
    }
}
