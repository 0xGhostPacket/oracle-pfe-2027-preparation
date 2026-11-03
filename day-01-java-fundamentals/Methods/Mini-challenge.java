public class Main {

    /*
     * Find the second-largest distinct number
     */
    public static int findSecondMax(int[] numbers) {

        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int max = numbers[0];
        Integer secondMax = null;

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];

            if (current > max) {
                secondMax = max;
                max = current;
            }

            else if (current < max &&
                    (secondMax == null || current > secondMax)) {

                secondMax = current;
            }
        }

        if (secondMax == null) {
            throw new IllegalArgumentException(
                    "At least two distinct numbers are required"
            );
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] numbers = {-5, 12, 3, 20, 8};

        System.out.println("Second largest: " + findSecondMax(numbers));

        // Additional tests
        System.out.println(findSecondMax(new int[]{10, 5, 20, 8}));
        System.out.println(findSecondMax(new int[]{5, 5, 4}));
        System.out.println(findSecondMax(new int[]{-10, -5, -20}));
    }
}