package com.sarahisweird.oopsose2021.uebung4.aufgabe4;

public class Main {
    public static void main(String[] args) {
        Punkt meinPunkt1 = new Punkt(4, 2);
        Punkt meinPunkt2 = new Punkt(4, 2);

        // Teil 2 von Aufgabe 4, viel besser :D
        System.out.println(meinPunkt1);
        System.out.println(meinPunkt2);

        // Teil 1 von Aufgabe 5
        System.out.println(meinPunkt1 == meinPunkt2);
        System.out.println(meinPunkt1.equals(meinPunkt2));

        /*
         * Okay, wieso passiert das jetzt? Die Punkte sind doch gleich?
         *
         * Jein: Die Werte sind gleich, aber trotzdem haben wir zwei unterschiedliche Objekte erzeugt. Damit sind
         * sie erstmal nicht gleich. Ein erneuter Blick in die Object-Klasse verrät uns wieder den Grund. So ist
         * equals() definiert:
         *
         * public boolean equals(Object obj) {
         *     return (this == obj);
         * }
         *
         * Der Operator '==' überprüft, ob die Objekte dieselben sind.
         *
         * Punkt p1 = new Punkt(1, 2);
         * Punkt p2 = new Punkt(1, 2);
         * Punkt p3 = p1;
         *
         * System.out.println(p1 == p2); // false, egal bei welcher Implementation von equals()
         * System.out.println(p1 == p3); // true, ditto
         *
         * Wenn wir Objekte trotzdem vergleichen wollen, müssen wir equals() überschreiben. Wie das geht,
         * seht ihr in com.sarahisweird.oopsose2021.aufgabe5.Punkt :D
         */
    }
}
