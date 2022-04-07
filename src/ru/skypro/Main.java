package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1

        int[] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < fraction.length; i++) {
            System.out.print(fraction[i] + " ");
        }
        System.out.println("");
        int myChoice[] = {56, 5, 24, 49, 35};
        for (int i = 0; i < myChoice.length; i++) {
            System.out.print(myChoice[i] + " ");
        }
        System.out.println("");

        //Задание 2

        System.out.print(mass[0]);
        for (int i = 1; i < mass.length; i++) {
                System.out.print( ", " + mass[i]);
        }
        System.out.println("");
        System.out.print(fraction[0]);
        for (int i = 1; i < fraction.length; i++) {
            System.out.print(", " + fraction[i]);
        }

        System.out.println("");
        System.out.print(myChoice[0]);
        for (int i = 1; i < myChoice.length; i++) {
            System.out.print(", " + myChoice[i]);
        }

        //Задание 3

        System.out.println("");
        System.out.print(mass[2]);
        for (int i = mass.length - 2; i >= 0; i--) {
            System.out.print( ", " + mass[i]);
        }
        System.out.println("");
        System.out.print(fraction[2]);
        for (int i = fraction.length - 2; i >= 0 ; i--) {
            System.out.print(", " + fraction[i]);
        }

        System.out.println("");
        System.out.print(myChoice[myChoice.length - 1]);
        for (int i = myChoice.length - 2; i >= 0; i--) {
            System.out.print(", " + myChoice[i]);
        }

        //Задание 4

        System.out.println("");
        for (int i = 0; i < mass.length; i++) {
            if (mass [i] % 2 != 0) {
                mass[i] = mass[i] + 1;
            }
            System.out.print(mass[i] + " ");
            }

        }



    }

