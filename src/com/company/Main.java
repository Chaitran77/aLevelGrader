package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        int paperMark;
        double paperPercentage;

        System.out.println("Type the maximum possible marks for this paper:\n");
        int maxMarks = scanner.nextInt();

        while (!exit) {
            System.out.println("Type the current paper's mark: \n");

            try {
                paperMark = scanner.nextInt();

                paperPercentage = ((double)paperMark/maxMarks)*100;
                System.out.println("% " + paperPercentage);

                if (paperPercentage > 100) {
                    System.out.println("Invalid input (greater than max). Try again.");
                } else {
                    calculateGrade(paperPercentage);
                }

            } catch (java.util.InputMismatchException e) {
                if (scanner.next().contains("exit")) {
                    System.out.println("Exit - Goodbye.");
                    exit = true; // could also use System.exit(0); here - would also remove need for exit var
                } else {
                    System.out.println("Error, please only type numeric characters. Try again: ");
                }
            }

        }
    }

    public static void calculateGrade(double percentage) {

        char paperLevel = 0;

        if (percentage >= 80) {
            paperLevel = 'A';
        } else if ((percentage >= 70) && (percentage <= 79)) {
            paperLevel = 'B';
        } else if ((percentage >= 60) && (percentage <= 69)) {
            paperLevel = 'C';
        } else if ((percentage >= 50) && (percentage <= 59)){
            paperLevel = 'D';
        } else if ((percentage >= 40) && (percentage <= 49)) {
            paperLevel = 'E';
        } else if (percentage < 40) {
            paperLevel = 'U';
        }
        System.out.println("Grade achieved: " + paperLevel);

    }
}
