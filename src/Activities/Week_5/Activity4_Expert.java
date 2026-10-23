package Activities.Week_5;

public class Activity4_Expert extends Arrays_Main {

//    GLOBAL INITIALIZATION
//      RAW DATA
    final static String[] NAMES = {"Velasquez", "Rusiana", "Laroco", "Smith", "Lopez" };
    final static int[][]  RAW_SCORE = {
            {81, 95, 90, 87},
            {91, 96, 90, 86},
            {81, 95, 90, 87},
            {88, 91, 92, 85},
            {98, 92, 79, 90}
    };


    public static void main() {
//        INITIALIZATION
        Student[] studentTable = student_array(NAMES, RAW_SCORE);
        double[] studentMeans = mean_array(studentTable);
        double[] sortedStudentMeans = sorting_array(studentMeans);

//        OUTPUT
        System.out.println("\n\n=========================\n EXPERT ACTIVITY\n=========================\n\n" +
                "----- STUDENT RANKINGS -----");
        printing_leaderboard(studentTable, studentMeans, sortedStudentMeans);

    }

    private static Student[] student_array(String[] names, int[][] data) {
        Student[] table = new Student[NAMES.length];

        for (int i = 0; i < table.length; ++i) {
            table[i] = new Student(names[i], data[i]);
        }

        return table;
    }

    private static double[] mean_array(Student[] table) {
        double[] means = new double[table.length];
        for (int i = 0; i < table.length; ++i) {
            means[i] = table[i].mean_calc();
        }

        return means;
    }

    private static double[] sorting_array(double[] means) {

        double[] sorted = means.clone();
        final int MAX = sorted.length;
        boolean swapped;

        for (int index1 = 0; index1 < MAX - 1; index1++) {
            swapped = false;
            for (int index2 = 0; index2 < MAX - index1 - 1; index2++) {
                if (sorted[index2] > sorted[index2 + 1]) {
                    double temp = sorted[index2];
                    sorted[index2] = sorted[index2 + 1];
                    sorted[index2 + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return sorted;
    }

    private static void printing_leaderboard(Student[] table, double[] meanArray, double[] sortedMeanArray) {
        final int MAX = meanArray.length;
        boolean[] isPrinted = new boolean[MAX];

        for (int index2 = 0; index2 < MAX; ++index2) {
            double currentHightScore = sortedMeanArray[MAX - index2 - 1];
            int rank = index2 + 1;

            for (int index1 = 0; index1 < MAX; ++index1) {
                if (!isPrinted[index1] && meanArray[index1] == currentHightScore) {
                    System.out.println("Top " + rank + ": " + table[index1].studentName + " - " + meanArray[index1]);
                    isPrinted[index1] = true;
                    break;
                }
            }
        }
    }

}

// STUDENT CLASS
class Student {
//    ATTRIBUTES
    String studentName;
    int[] studentScores;

//    CONSTRUCTOR METHOD
    public Student(String name, int[] scores) {
        studentName = name;
        studentScores = scores;
    }

    double mean_calc() {
        int sum = 0;

        for (int i : studentScores) {
            sum += i;
        }

        return (double) sum / studentScores.length;
    }
}
