public class Main {

    // Reverse a String
    public static String RevString(String text) {

        char[] letters = text.toCharArray();

        int start = 0;
        int end = letters.length - 1;

        while (start < end) {

            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;

            start++;
            end--;
        }

        return new String(letters);
    }

    // Check if a String is a Palindrome
    public static boolean isPalindrome(String text) {

        String reversed = RevString(text);

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + RevString(word));

        System.out.println("Is Palindrome? " + isPalindrome(word));
    }
}