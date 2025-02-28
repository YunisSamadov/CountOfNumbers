package a1;

import java.util.Scanner;

public class CountofNumbers {
    public static void main(String[] args) {
        //Finding the number of the digits of a number
        Count();
    }

    public static void Count() {
        System.out.println("Please input number");
        int a = new Scanner(System.in).nextInt();
        int count = 0;

        if (a > 0) {
            boolean b = a % 2 == 0;
            if (b) {
                System.out.println("Number is positive and even...");
            } else if (!b) {
                System.out.println("Number is positive and odd...");
            }
        } else {
            System.out.println("Number is minus...");
        }

        while (a > 0) {
            a = a / 10;
            count++;

        }
        System.out.println(count);

    }
}
