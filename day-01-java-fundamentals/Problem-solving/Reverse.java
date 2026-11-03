
import java.util.Arrays;

public class Main {

    public static void reverseArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int empty = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = empty;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        reverseArray(nums);

        System.out.println(Arrays.toString(nums));
    }
}
