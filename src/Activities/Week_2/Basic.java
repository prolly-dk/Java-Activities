package Activities.Week_2;

public class Basic extends Java_Operator_Main {
    public static void main() {
//        INITIALIZATION
        int num1 = 15, num2 = -7;

//        CALCULATION
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = num1 / num2;
        int modulus = num1 % num2;

//        OUTPUT
        System.out.println("\n\n=========================\n BASIC ACTIVITY\n=========================\n\n" +
                "Addition: " + addition +"\n" +
                "Substraction: " + subtraction + "\n" +
                "Multiplication: " + multiplication + "\n" +
                "Division: " + division + "\n" +
                "Modulus: " + modulus);

        /* ALl operators behave exactly how they should behave mathematically, including modulus which returns the positive remainder  */
    }
}
