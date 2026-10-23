package Activities.Week_5;

import java.util.Arrays;

public class Activity3_Advanced extends Arrays_Main {

//    GETTING STUDENT SCORES
    private static int[] studentScores = Activity2_Intermediate.getStudentScores();

    public static void main() {
//        INITIALIZATION
        int targetValue = 84;

//        OUTPUT
        System.out.println("\n\n=========================\n ADVANCED ACTIVITY\n=========================\n\n");
        linear_search(studentScores, targetValue);
        System.out.println("\n\nOriginal Array: ");
        print_array(studentScores);

//        SORTING ARRAY
        Arrays.sort(studentScores);
        System.out.println("\n\nSorted Array: ");
        print_array(studentScores);

        /*Sorting an array when searching can be helpful, because it can track duplicates of the same target value easier*/

    }

    private static void linear_search(int[] scores, int target) {
        int index = 0;
        final int MAX = scores.length;

        while (index < MAX) {
            if (scores[index] == target) {
                System.out.print("Target: " + target + " < FOUND" +
                        "\nAt Index: " + index);
                return;
            }
            ++index;
        }

        System.out.print("Target: " + target + " < NOT FOUND");

    }

    private static void print_array(int[] scores) {
        int index = 0;
        final int MAX = scores.length;

        while (index < MAX) {
            System.out.print(scores[index] + ", ");
            ++index;
        }
    }
}
