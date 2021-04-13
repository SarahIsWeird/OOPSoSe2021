package com.sarahisweird.oopsose2021.uebung2;

public class Aufgabe1u2 {
    public static void main(String[] args) {
        // Aufgabe 1
        int[] myarr = new int[10];

        for (int i = 1; i <= 10; i++) {
            myarr[i - 1] = i; // i - 1, weil Index ab 0!
        }

        // Alternativ, dieser Weg wird nicht gerne gesehen, außer bei Konstanten!
        // int[] myarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Aufgabe 2
        int i1 = 0;

        while (i1 < myarr.length) {
            System.out.print(myarr[i1] + " ");
            i1++;
        }

        System.out.println(); // Ohne Argumente macht nur eine neue Zeile. Bissl Formatierung

        int i2 = 0;

        do {
            System.out.print(myarr[i2] + " ");
            i2++;
        } while(i2 < myarr.length);

        System.out.println();

        for (int i3 = 0; i3 < myarr.length; i3++) {
            System.out.print(myarr[i3] + " ");
        }

        System.out.println();

        for (int zahl : myarr) {
            System.out.print(zahl + " ");
        }
    }
}
