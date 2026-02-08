
/*
Exercise 1: Divide by Zero
Write a Java program that divides two integers entered by the user and handles the
case when the second number is zero.
 */




import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            sc.close();
        }
    }
}
