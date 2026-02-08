/*
Exercise 2: Array Index Out of Bounds
Write a Java program that accesses an element from an array and handles the case
when the user enters an invalid index.
 */

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index (0–4): ");
            int index = sc.nextInt();

            System.out.println("Element at index " + index + " is: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");

        } finally {
            sc.close();
        }
    }
}
