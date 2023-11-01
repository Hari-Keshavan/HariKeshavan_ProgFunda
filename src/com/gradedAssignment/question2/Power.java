package com.weekTwo.gradedAssignment.question2;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        int base = in.nextInt();
        System.out.print("Enter the power N: ");
        int power = in.nextInt();
        System.out.println("X power N is: " + powerFunc(base, power));
    }
    static long powerFunc(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerFunc(base, power-1);
    }
}
