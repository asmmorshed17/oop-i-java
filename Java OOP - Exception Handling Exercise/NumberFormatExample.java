/*
## **Exercise 4: Number Format Exception**

**Write a Java program that converts user input from a string to an integer and handles the case when the input is not a valid number.**
 */

import java.util.Scanner;

public class NumberFormatExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");

        } finally {
            sc.close();
        }
    }
}

