package com.company;

public class Forward extends Footballer{


    public Forward(String name, int age, String club) {
        super(name, age, club);
    }

    @Override
    public String print() {
        System.out.println("Имя игрока " + getName()
                + "\nВозраст " + getAge()
                + "\nКлуб " + getClub()
                + "\nРоль игрока " + function()
                + "\n_______________");
        return null;
    }

    @Override
    public String function() {
        return "Атакующий";
    }
}

