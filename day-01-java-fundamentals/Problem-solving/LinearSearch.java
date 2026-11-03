public class Main {

    public static int  linearSearch(int[] numbers, int target) {
        for (int i = 0 ; i < numbers.length ; i++)
        {
            if(numbers[i] == target)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] numbers = {1,23,44,56,7,8,9,1};

        System.out.println(linearSearch(numbers,9));

    }
}