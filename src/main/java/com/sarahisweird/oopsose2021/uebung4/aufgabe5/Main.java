package com.sarahisweird.oopsose2021.uebung4.aufgabe5;

public class Main {
    public static void main(String[] args) {
        Punkt meinPunkt1 = new Punkt(4, 2);
        Punkt meinPunkt2 = new Punkt(4, 2);

        // Teil 1 von Aufgabe 5, und jetzt klappt auch alles! :D
        System.out.println(meinPunkt1 == meinPunkt2);
        System.out.println(meinPunkt1.equals(meinPunkt2));
    }
}
