package Activities.Week_4;


public class Activity2_Intermediate extends Control_Flow_2_Main {

    private static final int TERMINAL_VALUE = -1;

    public static void main() {

//        INITIALIZATION
        int[] values1 = {1, 2, 7, 2, 78, 9, -1};
        int[] values2 = {50, 3, -557, 1, 78, -1, -12234};

//        OUTPUT
        System.out.println("\n\n=========================\n INTERMEDIATE ACTIVITY\n=========================\n" +
                "Sum 1: " + sum_until_terminal(values1) + "\n" +
                "Sum 2: " + sum_until_terminal(values2));

    }

    private static int sum_until_terminal(int[] array) {
        int index = 0, sum = 0;

        while (array[index] != TERMINAL_VALUE) {
            sum += array[index];
            index++;
        }
        return sum;
    }
}
