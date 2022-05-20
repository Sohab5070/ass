package com.company;

public class Massage {
    private String mes;
    private int id_mass;
    private String text;
    private int id_user;

    Massage()
    {
        this.id_mass=(int)Math.random();
    }

    public String getMes()
    {
        return this.mes;
    }
    public void setMes(String mes)
    {
        this.mes = mes;
    }
    public int getId_mass()
    {
        return this.id_mass;
    }
    public void setId_mass(int id_mass)
    {
        this.id_mass = id_mass;
    }
    public String getText()
    {
        return this.text;
    }
    public void setText(String text)
    {
        this.text=text;
    }
    public int getId_user()
    {
        return this.id_user;
    }
    public void setId_user(int id_user)
    {
        this.id_user=id_user;
    }
}
