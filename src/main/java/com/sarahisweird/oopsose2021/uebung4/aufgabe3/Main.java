package com.sarahisweird.oopsose2021.uebung4.aufgabe3;

public class Main {
    public static void main(String[] args) {
        // Geht nicht! GraphischesObjekt ist abstrakt. Schon der Compiler meckert. :)
        // GraphischesObjekt meinGraphischesObjekt = new GraphischesObjekt();

        Punkt meinPunkt1 = new Punkt(6, 9);
        Punkt meinPunkt2 = new Punkt(4, 2);

        // Teil 1 von Aufgabe 4
        System.out.println(meinPunkt1);
        System.out.println(meinPunkt2);

        /*
         * Wieso kommt das?
         * 'Object' ist die Superklasse jedes Objekts in Java. Sie legt bestimmte Rahmen, damit es einheitliche
         * Konventionen geben kann, auch bei Entwicklern die sich nicht kennen. Sie definiert toString() so:
         *
         * public String toString() {
         *     return getClass().getName() + "@" + Integer.toHexString(hashCode());
         * }
         *
         * Was macht das? Es wird der Klassenname (nicht der Variablenname!) mit der Speicheradresse ausgegeben.
         * Das macht aber in den wenigsten Fällen Sinn. Deswegen überschreiben wir lieber mal toString() für Punkt.
         * Wie das passiert, seht ihr in com.sarahisweird.oopsose2021.uebung4.aufgabe4.Punkt.
         */
    }
}
