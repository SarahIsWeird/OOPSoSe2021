package com.sarahisweird.oopsose2021.uebung4.aufgabe5;

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

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    /*
     * Dat hier is n Dreiteiler. Jeder machts ein bisschen anders, aber ich denke, dass dieser Weg einer der
     * sinnvollsten ist.
     */
    @Override
    public boolean equals(Object obj) {
        /*
         * Sind das Objekt und "ich" dieselben? Dann brauchen wir ja gar nicht mehr überprüfen!
         */
        if (this == obj) {
            return true;
        }

        /*
         * Ist das Objekt gar keine Instanz von Punkt? Dann dürfen wir nicht auf Punkt casten, ansonsten bekommen wir
         * eine ClassCastException an den Kopf geschmissen. Und abgesehen davon: Wenns kein Punkt ist, ist es
         * sowieso nicht gleich.
         *
         * PS: Die doppelten Klammern sind leider nötig. Das hat was mit Operatorpräzedenz zu tun. Wenns dich
         * interessiert, frag mich einfach :D
         */
        if (!(obj instanceof Punkt)) {
            return false;
        }

        /*
         * Jetzt geht's ans Eingemachte. Wir casten das Objekt zu Punkt und vergleichen die Werte.
         * Btw: x und y haben integrale Datentypen, nämlich double, also können wir problemlos '==' benutzen.
         */
        Punkt punkt2 = (Punkt) obj;

        return this.x == punkt2.x && this.y == punkt2.y;
    }
}
