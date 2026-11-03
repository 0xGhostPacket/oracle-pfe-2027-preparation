public class main {
    public static int cube(int number)
    {
        return number * number * number;
    }

    public static boolean isPositive(int number){
        return number > 0;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {

        System.out.println(cube(5));
        System.out.println(isPositive(0));

        int[] numbers = {-5, 12, 3, 20, 8};
        System.out.println(findMax(numbers));

    }
}