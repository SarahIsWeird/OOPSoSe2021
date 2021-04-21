package com.sarahisweird.oopsose2021.uebung3;

public class Rechteck extends Punkt {
    private double x2, y2, x3, y3, x4, y4;

    public Rechteck(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1);

        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    @Override
    public double flaecheBerechnen() {
        double a = Math.sqrt((this.x2 - this.x) * (this.x2 - this.x) + (this.y2 - this.y) * (this.y2 - this.y));
        double b = Math.sqrt((this.x3 - this.x) * (this.x3 - this.x) + (this.y3 - this.y) * (this.y3 - this.y));

        return a * b;
    }
}
