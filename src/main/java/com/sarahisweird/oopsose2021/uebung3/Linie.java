package com.sarahisweird.oopsose2021.uebung3;

public class Linie extends Punkt {
    private double x2, y2;

    public Linie(double x1, double y1, double x2, double y2) {
        super(x1, y1);

        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double flaecheBerechnen() {
        return 0;
    }
}
