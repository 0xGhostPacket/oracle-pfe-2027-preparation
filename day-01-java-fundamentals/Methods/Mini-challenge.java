/*
* Find the second-largest distinct number
*/

public static int findSecondMax(int[] numbers) {

    if (numbers == null || numbers.length < 2) {
        throw new IllegalArgumentException(
                "At least two distinct numbers are required"
        );
    }

    int max = numbers[0];
    int secondMax = Integer.MIN_VALUE;

    for (int i = 1; i < numbers.length; i++) {

        if (numbers[i] > max) {
            secondMax = max;
            max = numbers[i];
        }

        else if (numbers[i] > secondMax && numbers[i] < max) {
            secondMax = numbers[i];
        }
    }

    if (secondMax == Integer.MIN_VALUE) {
        throw new IllegalArgumentException(
                "No second-largest distinct number"
        );
    }

    return secondMax;
}

public class Main {

    public static void main(String[] args)
    {

    }
}