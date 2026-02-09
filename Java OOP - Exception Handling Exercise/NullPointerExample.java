/*
Exercise 3: Null Pointer Exception
Write a Java program that tries to use a method (like length()) on a null string and
handles the resulting exception.
 */

public class NullPointerExample {
    public static void main(String[] args) {

        try {
            String text = null;

            // Trying to call a method on a null object
            int length = text.length();

            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call a method on a null object.");
        }
    }
}

//Error: Cannot call a method on a null object.

/*
🔁 What happens step by step
String text = null;          // OK
int length = text.length(); // ❌ runtime error occurs HERE


Then control jumps to:

catch (NullPointerException e) {
    System.out.println("Error: Cannot call a method on a null object.");
}

Output:
Error: Cannot call a method on a null object.
 */
// ------------------------------------