package com.company;

public abstract class Footballer implements Printable {
    protected String name;
    protected int age;
    protected String club;

    public Footballer(String name, int age, String club){
        this.name = name;
        this.age = age;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}

