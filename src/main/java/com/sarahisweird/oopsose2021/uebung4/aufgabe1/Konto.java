package com.sarahisweird.oopsose2021.uebung4.aufgabe1;

public class Konto {
    private static int anzahl;

    private int kontoNummer;

    static {
        Konto.anzahl = 20000;
    }

    public Konto() {
        this.kontoNummer = Konto.anzahl;
        Konto.anzahl++;

        System.out.println("Neues Konto erstellt. Kontonummer: " + this.kontoNummer);
    }
}
