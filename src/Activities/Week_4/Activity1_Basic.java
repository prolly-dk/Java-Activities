package Activities.Week_4;

public class Activity1_Basic extends Control_Flow_2_Main {
    public static void main() {

//        INITIALIZATIONS
        int max_iteration = 10;

//      OUTPUT
        System.out.println("\n\n=========================\n BASIC ACTIVITY\n=========================\n\n");
        loop_counting(max_iteration);
        loop_counting(max_iteration = 20);


    }

    private static void loop_counting(int max) {
        int countPOW2;
        for (int i = 1;  i <= max ; ++i ) {
            countPOW2 = i * i;
            System.out.println("Number: " + i + " Squared " + countPOW2);
        }
        System.out.println(" ");

    }

}
