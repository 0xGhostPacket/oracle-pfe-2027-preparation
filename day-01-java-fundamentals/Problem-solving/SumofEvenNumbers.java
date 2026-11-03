/*
    You are given an array of N integers.
    Write a Java program that calculates the sum of all even numbers in the array.
*/


import java.util.Scanner;

public class Main {

    public static int sumOfeven(int[] numbers) {
        int sumOfeven = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfeven += numbers[i];
            }
        }

        return sumOfeven;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = userInput.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = userInput.nextInt();
        }

        System.out.println(
                "Sum of Even Numbers is: " + sumOfeven(numbers)
        );

        userInput.close();
    }
}
