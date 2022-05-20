package com.company;

import java.util.ArrayList;

public class Moderator extends Additionally {
    String name;
    String pass;
    int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id=id;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;

    }

    @Override
    public String getPass() {
        return this.pass;
    }

    @Override
    public void setPass(String pass) {
        this.pass=pass;

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
    public void edit_mass(int id_mass, ArrayList<Massage> mass, String text) {
        for (int i=0; i< mass.size(); i++)
        {
            mass.get(i).setId_mass(id_mass);
            if (mass.get(i).getId_mass()==id_mass)
            {
                mass.get(i).setText(text);
            }
        }

    }

    @Override
    public void del_mass(int id_mass, ArrayList<Massage> mass1, ArrayList<Additionally> users, int id_user) {
        for (int i=0; i<mass1.size(); i++)
        {
            for(int j=0; j< users.size(); j++)
            {
                if(users.get(j).getId()==id_user)
                {
                    if(mass1.get(i).getId_mass()==id_mass)
                    {
                        mass1.remove(mass1.get(i));
                    }
                }
            }

        }

    }

    public void del_massage_user(int id_mass, ArrayList<Massage> mass)
    {
        for (int i=0; i<mass.size(); i++)
        {
            if(mass.get(i).getId_mass()==id_mass)
            {
                mass.remove(mass.get(i));
            }
        }
    }
}
