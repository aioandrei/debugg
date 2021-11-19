public class DebugAverageCalculation
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("The numbers are:");
        printNumbers(numbers);
        System.out.println("Average Calculation ");
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    private static void printNumbers(int[] input)
    {
        for (int index = 0; index < input.length; index++) {
            System.out.println(index + ":" + input[index]);
        }
    }

    private static double calculateAverage(int[] input)
    {
        double result = 0;
        for (int element : input) {
            result += element;
        }
        result = result / input.length;
        return result;
    }
}
