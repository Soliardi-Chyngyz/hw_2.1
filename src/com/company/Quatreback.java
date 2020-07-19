package com.company;

public class Quatreback extends Footballer{
    public Quatreback(String name, int age, String club) {
        super(name, age, club);
    }
    @Override
    public String print() {
        System.out.println("Имя игрока " + getName()
                + "\nВозраст " + getAge()
                + "\nКлуб " + getClub()
                + "\nРоль игрока " + function());
        return null;
    }

    @Override
    public String function() {
        return "полузащитник";
    }
}
