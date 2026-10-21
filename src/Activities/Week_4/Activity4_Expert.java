package Activities.Week_4;

import java.util.Scanner;

public class Activity4_Expert extends Control_Flow_2_Main {

    private static final int BROKEN_SHELF = -1;
    private static final int CRITICAL_THRESHOLD = 20;
    private static final int MAX_SHELF_CAPACITY = 100;

    private static int[][] shelf_table = {
            {20, 50, 30, -1},
            {25, 30, 13, 97},
            {3, 68, 97, 90},

    };

    public static void main() {

//        INITIALIZATION
        char userAction, userProcessing = 'Y';
        Scanner sc = new Scanner(System.in);

//        OUTPUT
        System.out.println("\n\n=========================\n EXPERT ACTIVITY\n=========================\n\n");
        System.out.println("------ WAREHOUSE INVENTORY SCANNER ------\n");

        do {
            System.out.println("\nFind Total[T/t] OR Restock Critically Low Shelf[R/r]: ");
            userAction = sc.next().charAt(0);

            if (userAction == 'T' || userAction == 't') {
                printing_total();
            }
            else if (userAction == 'R' || userAction == 'r') {
                restock_items();
            }
            else {
                System.out.println("INVALID INPUT");
            }


            while(userAction != 'N' || userAction == 'n') {
                System.out.println("\nProcess Another[Y/N]: " );
                userProcessing = sc.next().charAt(0);

                if (userProcessing == 'Y' || userProcessing == 'N' || userProcessing == 'y'  || userProcessing == 'n') {
                    break;
                }
                else {
                    System.out.print("INVALID INPUT");
                    continue;
                }
            }


        }

        while (userProcessing == 'y' || userProcessing == 'Y' );


    }

    private static int counting_items(int[][] table) {
        final int MAX1 = table.length;
        final int MAX2 = table[0].length;
        int total = 0, index1 = 0, index2 = 0;
        while(index1  < MAX1 ) {
            while(index2 < MAX2 ) {
                if (table[index1][index2] == BROKEN_SHELF) {
                    index2++;
                    continue;
                }
                else {
                    total += table[index1][index2];
                    index2++;
                }
            }
            index2 = 0;
            ++index1;
        }
        return total;
    }

    private static void printing_total() {
        System.out.println("\nThe Total Items: " + counting_items(shelf_table));
    }

    private static void restock_items() {
        int index1 = 0, index2 = 0;
        final int MAX = shelf_table.length;
        boolean found = false;

        while (index1 < MAX) {
            while (index2 < MAX) {
                if (shelf_table[index1][index2] <= CRITICAL_THRESHOLD) {

                    System.out.println("\nShelf " + (index2 + 1) + "\n" +
                            "Location: " + shelf_height(index1) + "\n" +
                            "Items Stored: " + shelf_table[index1][index2]);
                    shelf_table[index1][index2] += (MAX_SHELF_CAPACITY - shelf_table[index1][index2]);
                    System.out.println("Items Stored After Restock: " + shelf_table[index1][index2]);

                    found = true;

                    return;
                } else {
                    ++index2;
                }
            }
            index2 = 0;
            ++index1;
        }

        if (!found) {
            System.out.println("\nNo Shelf is in Critical Stored Items");
        }

    }

    private static String shelf_height(int index) {
        if (index == 0) {
            return "Top";
        }
        else if (index == 1) {
            return "Middle";
        }
        else if (index == 2) {
            return "Bottom";
        }
        else {
            return "Not a valid shelf position";
        }
    }

}