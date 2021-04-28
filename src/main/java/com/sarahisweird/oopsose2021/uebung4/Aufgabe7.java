package com.sarahisweird.oopsose2021.uebung4;

public class Aufgabe7 {
    public static void main(String[] args) {
        String hallo = "Hallo!";
        System.out.println(hallo);

        String hello = hallo.replace('a', 'e');
        System.out.println(hello);

        String ichBin10MBgross = "";

        for (int i = 0; i < 1000000; i++) {
            ichBin10MBgross = ichBin10MBgross + "0123456789"; // Den Kack geben wir mal lieber nicht aus. kekw
        }

        /*
         * String sind unveränderbar in Java. Das bedeutet, dass wenn man einen String ändern will, dass ein
         * neuer erzeugt werden muss. Das ist bei so großen Operationen sehr ineffizient. Ich hab einen guten
         * Prozessor, und das dauert Ewigkeiten. Viel besser ist die StringBuilder-Klasse. Mit ihr ist es sehr
         * effizient, große Strings zu bauen, da der intern gespeicherte String veränderbar ist. Man benutzt
         * die Klasse so:
         */

        StringBuilder meinStringBuilder = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            meinStringBuilder.append("0123456789");
        }

        // Das geht jetzt *viel* schneller :D

        /*
         * Benchmarks:
         * Von wem   |      Prozessor      | Methode 1 | Methode 2
         * Sarah     |   AMD Ryzen 5 3600  |  17m 28s  |   272ms
         * Christian | Intel i5 7600K (OC) |    TBA    |    30ms
         */
    }
}
