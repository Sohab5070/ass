package com.company;

import java.util.ArrayList;

public class Admin extends Additionally {
    String name;
    String pass;
    int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getPass() {
        return this.pass;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;

    }

    @Override
    public void write_mass(int id_mass, String mes, String text, int id_user, ArrayList<Massage> mass1) {
        Massage mass = new Massage();
        mass.setId_mass(id_mass);
        mass.setMes(mes);
        mass.setText(text);
        mass.setId_user(id_user);
        mass1.add(mass);
    }

    @Override
    public void edit_mass(int id_mass, ArrayList<Massage> mass1, String text) {
        for (int i = 0; i < mass1.size(); i++) {
            mass1.get(i).setId_mass(id_mass);
            if (mass1.get(i).getId_mass() == id_mass) {
                mass1.get(i).setText(text);
            }
        }

    }

    @Override
    public void del_mass(int id_mass, ArrayList<Massage> mass1, ArrayList<Additionally> additionally, int id_user) {
        for (int i = 0; i < mass1.size(); i++) {
            for (int j = 0; j < additionally.size(); j++) {
                if (additionally.get(j).getId() == id_user) {
                    if (mass1.get(i).getId_mass() == id_mass) {
                        mass1.remove(mass1.get(i));
                    }
                }
            }
        }
    }

    public void add_user ( int id, String name, String pass, ArrayList <Additionally> additionally)
    {
        User new_additionally = new User();
        new_additionally.setId(id);
        new_additionally.setName(name);
        new_additionally.setPass(pass);
        additionally.add((new_additionally));
    }

    public void del_user ( int id, ArrayList<Additionally> additionally)
    {
        for (int i = 0; i < additionally.size(); ++i) {
            if (additionally.get(i).getName().equals(name)) {
                additionally.remove(additionally.get(i));

            }

        }
    }



    public void create_moder (ArrayList <Additionally> additionally,int id)
    {
        for (int i = 0; i < additionally.size(); i++) {
            if (additionally.get(i).getId() == id) {
                Moderator moderator = new Moderator();
                moderator.setId(id);
                moderator.setName("Модератор " + additionally.get(i).getName());
                moderator.setPass(additionally.get(i).getPass());

                additionally.remove(additionally.get(i));

                additionally.add(moderator);
            }
        }
    }
}
