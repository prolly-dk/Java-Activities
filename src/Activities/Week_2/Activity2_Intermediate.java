package Activities.Week_2;

public class Activity2_Intermediate extends Java_Operator_Main {
    public static void main() {
        //    INITIALIZATION
        int classLeave = 5, gradeAvg = 95;

        //    OUTPUT
        System.out.println("\n\n=========================\n INTERMEDIATE ACTIVITY\n=========================\n\n" +
                "Absences: " + classLeave + "\n" +
                "Average Grade: " + gradeAvg + "\n" +
                "PASSED: " + ((gradeAvg >= 75 && classLeave <= 3) || gradeAvg >= 90) + "\n\n" +
                "Explanation: The student passed because even if the first condition of absences is false, the other condition of average grade of 90 was met. Using || / OR only needs one condition to be true to return true");
    }
}
