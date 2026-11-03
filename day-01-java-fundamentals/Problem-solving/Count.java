/*
    Count Positive, Negative and Zero
*/


public class Main {

    public static int[] count(int[] numbers) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positive++;
            }
            else if (numbers[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        return new int[]{positive, negative, zero};
    }

    public static void main(String[] args) {

        int[] numbers = {-1, 0, 1, 2, 3, 4, 55, 0, 0, -99};

        int[] result = count(numbers);

        System.out.println("Positive: " + result[0]);
        System.out.println("Negative: " + result[1]);
        System.out.println("Zero: " + result[2]);
    }
}
