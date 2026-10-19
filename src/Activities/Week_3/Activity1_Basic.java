package Activities.Week_3;

public class Activity1_Basic extends Control_Flow_1_Main {
    public static void main() {
//        INITIALIZATIONS
        int score = 55;


//        OUTPUT
        System.out.println("\n\n=========================\n BASIC ACTIVITY\n=========================\n\n" +
                "First Score: " + score + "\n" +
                "Passed: " + grade_classifier(score));
            score = 95;
            System.out.println("Second Score: " + score + "\n" +
                    "Passed: " + grade_classifier(score));
    }

    private static boolean grade_classifier(int score) {
        if (score >= 60) {
            return true;
        }
        else {
            return false;
        }
    }
}
