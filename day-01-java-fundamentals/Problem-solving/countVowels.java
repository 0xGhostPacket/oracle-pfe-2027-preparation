
public class Main {

    public static int countVowels(String text) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (
                    text.charAt(i) == 'a' ||
                            text.charAt(i) == 'e' ||
                            text.charAt(i) == 'i' ||
                            text.charAt(i) == 'o' ||
                            text.charAt(i) == 'u' ||
                            text.charAt(i) == 'A' ||
                            text.charAt(i) == 'E' ||
                            text.charAt(i) == 'I' ||
                            text.charAt(i) == 'O' ||
                            text.charAt(i) == 'U'
            ) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "Hello World";

        System.out.println(countVowels(text));
    }
}
