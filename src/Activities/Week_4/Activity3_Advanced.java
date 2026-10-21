package Activities.Week_4;

public class Activity3_Advanced extends Control_Flow_2_Main {

//    GLOBAL INITIALIZATION
    private static final int[] CONDITIONS = {4, 2};

    public static void main() {

//        INITIALIZATION
        int length = 5;

//        OUTPUT
        System.out.println("\n\n=========================\n ADVANCED ACTIVITY\n=========================\n\n" +
                "Printing Square: \n");
        print_square(length);
        System.out.println("\nPrinting Triangle: \n");
        print_triangle(length);



    }

    private static void print_square(int size) {
        int x = 0, y;

        for (y = 0; y < size; ++y) {

            /*------------------ THIS LINE DEMONSTRATE CONTINUE -------------------*/
            if (y == CONDITIONS[1]) {
                continue;
            }
            while (x <= size) {
                System.out.print(" X ");
                ++x;

                /*------------------ THIS LINE DEMONSTRATE CONTINUE -------------------*/
                if (x == CONDITIONS[0] ){
                    break;
                }
            }
            x = 0;
            System.out.print("\n");
        }

    }

    private static void print_triangle(int size) {
        int x = 0, y, counter = 0;

        for (y = 0; y < size; ++y) {
            while (x <= size) {
                ++x;
                System.out.print(" X ");
                if (counter < x) {
                    ++counter;
                    break;
                }
            }
            x = 0;

            System.out.println("\n");
        }
        counter = 0;

    }


}
