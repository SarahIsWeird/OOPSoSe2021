package com.sarahisweird.oopsose2021.uebung4.aufgabe3;

public class Punkt extends GraphischesObjekt {
    protected double x;
    protected double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double flaecheBerechnen() {
        return 0;
    }
}
