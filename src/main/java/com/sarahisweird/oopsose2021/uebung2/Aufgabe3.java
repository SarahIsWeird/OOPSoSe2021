package com.sarahisweird.oopsose2021.uebung2;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[][] array = { new int[4], new int[4], new int[3], new int[4] };

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = y * 10 + x;
            }
        }

        array[1][1] = 7;

        // Das geht nicht!
//        for (int y = 0; y < 4; y++) {
//            for (int x = 0; x < 4; x++) {
//                System.out.print(array[y][x] + " ");
//            }
//
//            System.out.println();
//        }

        array[2] = new int[4];
        for (int x = 0; x < 4; x++) {
            array[2][x] = 20 + x;
        }

        for (int[] zeile : array) {
            for (int spalte : zeile) {
                System.out.print(spalte + "\t");
            }

            System.out.println();
        }
    }
}
