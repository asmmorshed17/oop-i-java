/*
Exercise 5: Input Mismatch Exception
Write a Java program that takes an integer input using a Scanner and handles the case
when the user enters a non-integer value.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer value.");

        } finally {
            sc.close();
        }
    }
}
