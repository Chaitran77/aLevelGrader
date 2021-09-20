package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        int paperMark;
        double paperPercentage;
        char paperLevel = 0;
        System.out.println("Type the maximum possible marks for this paper:\n");
        int maxMarks = scanner.nextInt();

        while (!exit) {
            System.out.println("Type the current paper's mark: \n");
            paperMark = scanner.nextInt();
            paperPercentage = (double)(paperMark/maxMarks)*100;
            System.out.println("% " + paperPercentage);


            if (paperPercentage > 80) {
                paperLevel = 'A';
            } else if ((paperPercentage > 70) && (paperPercentage < 79)) {
                paperLevel = 'B';
            } else if ((paperPercentage > 60) && (paperPercentage < 69)) {
                paperLevel = 'C';
            } else if ((paperPercentage > 50) && (paperPercentage < 59)){
                paperLevel = 'D';
            } else if ((paperPercentage > 40) && (paperPercentage < 49)) {
                paperLevel = 'E';
            } else if (paperPercentage < 40) {
                paperLevel = 'U';
            }

            System.out.println("Grade achieved: " + paperLevel);

        }
    }
}
