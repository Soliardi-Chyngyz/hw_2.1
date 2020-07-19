package com.company;

public class Goalkepper extends Footballer{

    public Goalkepper(String name, int age, String club) {
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
        return "Вратарь";
    }
}
