package com.sarahisweird.oopsose2021.uebung4.aufgabe4;

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

    /*
     * Wieso überschreiben wir das hier, und nicht in GraphischesObjekt?
     * Naja, es gibt ja auch viele andere graphische Objekte. Zum Beispiel ein Viereck: Das hat vier Punkte.
     * Man müsste raten, wie viele Punkte ein Objekt hat. Vielleicht hat ein bestimmtes Objekt sogar ein
     * Punkt mit drei Koordinaten! (3D) Lieber soll das jede Klasse alleine regeln.
     */
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
