package Activities.Week_2;

public class Expert extends Java_Operator_Main {
    public static void main() {
//        INITIALIZATION
        int index = 0, num1 = 50, num2 = 25;
        char bool = 'y';

//        EXPRESSIONS
        /*The result of expression 1 will be true because all 2 conditions connected by && are true which returns true */
        boolean expression1 = ((num1 * num2) == (num2 *= num1) && index == 0); index++;
        /*The result of expression 2 will be false because neither conditions are true which even with || returns false*/
        boolean expression2 = ((--index >= 1) || ((num2 * index) == num1));
        /*The result of expression will be true beacuse even if num1 < num2 is false, the OR operator returns true because bool == 'y' returns true thus meeting the conditions for the && operator to return true*/
        boolean expression3 = ((index += ++index) < num2) && (bool == 'y' || num1 < num2);

//        OUTPUT
        System.out.println("\n\n=========================\n EXPERT ACTIVITY\n=========================\n\n" +
                "Expression 1: " + expression1 + "\n" +
                "Expression 2: " + expression2 + "\n" +
                "Expression 3: " + expression3);
    }
}
