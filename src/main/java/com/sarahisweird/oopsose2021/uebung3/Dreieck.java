package com.sarahisweird.oopsose2021.uebung3;

public class Dreieck extends Punkt {
    private double x2, y2, x3, y3;

    public Dreieck(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1);

        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double flaecheBerechnen() {
        double a = Math.sqrt((this.x2 - this.x) * (this.x2 - this.x) + (this.y2 - this.y) * (this.y2 - this.y));
        double b = Math.sqrt((this.x3 - this.x) * (this.x3 - this.x) + (this.y3 - this.y) * (this.y3 - this.y));
        double c = Math.sqrt((this.x2 - this.x3) * (this.x2 - this.x3) + (this.y2 - this.y3) * (this.y2 - this.y3));

        double s = (a + b + c) /2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
