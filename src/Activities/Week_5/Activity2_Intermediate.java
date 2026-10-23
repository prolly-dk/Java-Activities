package Activities.Week_5;

public class Activity2_Intermediate extends Arrays_Main {

//    GLOBAL INITIALIZATION
    public static int[] studentScores = {79, 81, 97, 61, 84, 81, 79, 89};

    public static void main() {
//        INITIALIZATION
        int sum = calculating_sum(studentScores),
                highestScore = finding_max(studentScores),
                lowestScore = finding_min(studentScores);
        double mean = calculating_mean(studentScores, sum);

        System.out.println("\n\n=========================\n INTERMEDIATE ACTIVITY\n=========================\n\n" +
                "Sum: " + sum + "\n" +
                "Average: " + mean + "\n" +
                "Highest Score: " + highestScore + "\n" +
                "Lowest Score: " + lowestScore);
    }

    private static int calculating_sum(int[] scores) {
        int index = 0, sum = 0;
        final int MAX = scores.length;

        while (index < MAX) {
            sum += scores[index];
            ++index;
        }

        return sum;
    }

    private static int finding_min(int[] scores) {
        int index =  0, low = scores[index];
        final int MAX = scores.length;

        while(index < MAX) {
            if ( low > scores[index] ) {
                low = scores[index];
            }
            ++index;

        }

        return low;

    }

    private static int finding_max(int[] scores) {
        int index = 0, high = scores[index];
        final int MAX = scores.length;

        while(index < MAX) {
            if ( high < scores[index] ) {
                high = scores[index];
            }
            ++index;

        }

        return high;
    }

    private static double calculating_mean(int[] scores, int sum) {
        return (double) sum / scores.length;
    }

    public static int[] getStudentScores() {
        return studentScores;
    }

}
