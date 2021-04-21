package com.sarahisweird.oopsose2021.uebung3;

public class Punkt {
    protected double x, y;
    private static int anzahlInitialisierung;

    static {
        Punkt.anzahlInitialisierung = 77;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;

        Punkt.anzahlInitialisierung++;

        System.out.println("Punkt (oder eine Subklasse) wurde " + anzahlInitialisierung + " mal initialisiert.");
    }

    public double flaecheBerechnen() {
        return 0;
    }
}
