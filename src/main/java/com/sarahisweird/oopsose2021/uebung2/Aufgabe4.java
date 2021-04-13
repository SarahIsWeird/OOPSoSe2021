package com.sarahisweird.oopsose2021.uebung2;

public class Aufgabe4 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 1, 2, 3 }
        };

        for (int[] zeile : array) {
            for (int spalte : zeile) {
                System.out.print(spalte + " ");
            }

            System.out.println();
        }
    }
}
