package Activities.Week_2;

public class Advanced extends Java_Operator_Main {
    public static void main() {
//        INITIALIZATION
        int initialBalance = 105, count = 1;

//        OUTPUT
        System.out.println("\n\n=========================\n ADVANCED ACTIVITY\n=========================\n");
            System.out.println("Initial Balanace: " + initialBalance);
            initialBalance += 5;
            System.out.println("Balance after += 5: " + initialBalance);
            initialBalance *= 3;
            System.out.println("Balance after *= 3: " + initialBalance);
            initialBalance *= 0.5;
            System.out.println("Balance after *= 0.5: " + initialBalance);

            System.out.println("\nCounter with ++count: " + count + ", " + ++count + "\n" +
                    "Counter with count++: " + count + ", " + count++);

            /* ++count Increments first before the variable get printed because the increment operator is at the front meanwhile the count++ never did increment because it increased the value after the variable is already printed*/
    }
}
