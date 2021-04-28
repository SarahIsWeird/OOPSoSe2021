package com.sarahisweird.oopsose2021.uebung4;

public class Aufgabe8 {
    public static void main(String[] args) {
        String hallo1 = "hallo";
        String hallo2 = "hallo";

        // Hier wird verglichen, ob der Inhalt der gleiche ist. Ist er -> wahr.
        System.out.println(hallo1.equals(hallo2));

        // Hier wird verglichen, ob die Objekte die Gleichen sind. Sind sie nicht -> falsch.
        System.out.println(hallo1 == hallo2);
    }
}
