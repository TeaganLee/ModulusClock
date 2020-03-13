package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ModulusClock();
    }

    public static void ModulusClock() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int hours;
        int minutes;


        System.out.println("Hour:");
        //hours = keyboard.nextInt();
        hours = 12;

        System.out.println("Minute:");
        //minutes = keyboard.nextInt();
        minutes = 30;

        hours = minutes >= 60 ? (hours + (minutes / 60)) : hours;

        minutes = (minutes % 60);
        hours = hours % (12) == 0 ? 12 : hours % 12;

        System.out.printf("the time is: %d:%02d", hours, minutes);

        System.out.println("");

        if (hours < 10) {
            System.out.println("it is bedtime.");
        } else if (hours > 10) {
            System.out.println("it is play time.");

        } else {
            System.out.println("It is not bedtime");
        }
    }


}


