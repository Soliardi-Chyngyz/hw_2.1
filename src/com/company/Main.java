package com.company;

import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{Forward.class.getSimpleName(),Goalkepper.class.getSimpleName(),Quatreback.class.getSimpleName()};

        for (String gamers: array){
            Footballer gamer = Main.createObject(gamers);
            System.out.print(gamer.print());
        }

//        final int min = 18;
//        final int max = 35;
//        final int rnd = rnd(min, max);
//        System.out.println("Cлучайный возрост: " + rnd);
    }

    public static Footballer createObject(String className){
        Footballer gamer = null;
        switch (className){
            case "Forward":
                gamer = new Forward("Ronaldo", 34, "Juventus");
                break;
            case "Goalkepper":
                gamer = new Goalkepper("Cassilias", 37, "Real Madrid");
                break;
            case "Quatreback":
                gamer = new Quatreback("Xavi", 37, "Bavaria");
                break;
        }
        return gamer;
    }

//    public static int rnd(int min, int max) {
//        max -= min;
//        return (int) (Math.random() * ++max) + min;
//    }

    //        String className;
//    public static String createObject() {
//        String[] nameList = {"Ronaldo", "Messi", "Homels", "Gabaev", "Mamaev"};
//        int nameLength = nameList.length;
//        int random1 = (int) (Math.random() * nameLength);
//
//        String[] clubList = {"Real Madrid", "Munchen Bavaria", "Barselona"};
//        int clubLength = clubList.length;
//        int random2 = (int) (Math.random() * clubLength);
//        if (random1 == 0) {
//            Goalkepper ron = new Goalkepper(nameList[random1], rnd(18, 35), clubList[random2]);
//            ron.print();
//        }
//        return ron.print();
//    }
}



