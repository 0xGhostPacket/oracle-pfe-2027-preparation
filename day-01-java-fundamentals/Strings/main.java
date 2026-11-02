import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        /*
        Exercise 1 — Count characters
        Read one line from the user and print its length.
        */

        Scanner userInput = new Scanner(System.in);
        String text = userInput.nextLine();
        System.out.println("Count characters: " + text.length());


        /*
            Exercise 2 — Reverse a String
            Read a word and print it backwards.
            Example:
            Input:  hello
            Output: olleh
        */


        System.out.println("input: " + text);

        String revText = "";

        for (int i = text.length() - 1;  i >= 0 ; i--)
        {
            revText += text.charAt(i);
        }

        System.out.println("output: " + revText);

        if (revText.equals(text))
        {
            System.out.println("Palindrome");
        }

        else
        {
            System.out.println("Not Palindrome");
        }

        userInput.close();

    }
}