package com.sarahisweird.oopsose2021.uebung4;

public class Aufgabe6 {
    public static void main(String[] args) {
        String hallo = "Hallo uwu  ";

        System.out.println("Länge von hallo: " + hallo.length());
        System.out.println("Das erste Zeichen von hallo: '" + hallo.charAt(0) + "'");
        System.out.println("Die Zeichen 2-6 von hallo: \"" + hallo.substring(2, 7) + "\"");
        System.out.println("Alle Zeichen ab dem dritten von hallo: \"" + hallo.substring(3) + "\"");
        System.out.println("hallo, ohne Leerzeichen an der Seite: \"" + hallo.trim() + "\"");
        System.out.println("Ist hallo ohne Beachtung von Groß- und Kleinschreibung identisch zu \"hAlLo UwU  \"? "
                + hallo.equalsIgnoreCase("hAlLo UwU  "));
        System.out.println("hallo, aber alles ist klein: \"" + hallo.toLowerCase() + "\"");
        System.out.println("hallo, aber alles ist groß: \"" + hallo.toUpperCase() + "\"");
    }
}
