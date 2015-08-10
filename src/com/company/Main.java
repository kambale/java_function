package com.company;

public class Main {

    public static void main(String[] args) {

        //1. Print one asterisk to the console
        System.out.println("*");
        System.out.println("");

        // for (<initial value> ; <condition> ; <control>)

        //2. Given a number n, print n lines, each with one asterisks
        for (int i = 0; i < 3; i++)
            //for (int i = 1; i > 0; i--)
            System.out.println("*");
        System.out.println("");

        //3. Given a number n, print n asterisks on one line
        for (int i = 0; i < 3; i++)
            //for (int i = 1; i > 0; i--)
            System.out.print("*");
        System.out.println("");

        //4. Given a number n, print n lines, each with one more asterisk than the last. Like this:
        //*
        //**
        //***
        Integer numberofasterisks = 5;

        for (int i = 0; i <= numberofasterisks; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("");

        //debugging

        for (int i = 0; i <= numberofasterisks; i++) {
            System.out.print(i + ": ");
            for (int j = i; j > 0; j--) {
                //System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = i; j > 0; j--) {
                //System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }

        //*** another way to do it

        Integer counter = 0;
        Integer numberOfLines = 5;
        while (counter <= numberOfLines) {
            Integer columns = counter;
            while (columns > 0) {
                System.out.print("*");
                columns--;
            }
            counter++;
            System.out.println();
        }

        Integer number = 5;
        while (number >= 0) {
            Integer columns = number;
            while (columns > 0) {
                System.out.print("*");
                columns--;
            }
            number--;
            System.out.println();
        }

        // Given a number n, print the sum of all of the numbers from 1 to n.
        Integer result = 0;
        Integer mynumber = 6;

        for (int i = 1; i <= mynumber; i++) {
            System.out.println("i = " + i + " => " + result + " + " + i);
            result = result + i;
        }

        //Given a number n, print n! (n factorial).

        Integer secresult = 1;
        Integer secnumber = 6;

        for (int i = 1; i <= secnumber; i++) {
            System.out.println("i = " + i + " => " + secresult + " * " + i);
            secresult = secresult * i;
        }
        System.out.println(secresult);

        //Given a number n, print the average of all of the numbers from 1 to n.

        //pi , 3.14159265358979323846

        double pi = Math.PI;
        // double approximation = 4 * (1.0 - 1.0/3)

        double x = 0;

        for (int i = 1;)



    }
}
