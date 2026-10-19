package Activities.Week_3;

public class Intermediate extends Control_Flow_1_Main {
    public static void main() {
//        INITIALIZATIONS
        double purchaseAmount = 500.00;
        double discountRate = discount_assigning(purchaseAmount);

//        CALCULATIONS
        int discountTier = (int) (discountRate * 100);
        double totalCost = purchaseAmount - (purchaseAmount * discountRate);

//        OUTPUT
        System.out.println("\n\n=========================\n INTERMEDIATE ACTIVITY\n=========================\n\n" +
                "Amount Purchased: " + purchaseAmount + "\n" +
                "Discount Tier: " + discountTier + "%\n" +
                "Total Cost: " + totalCost);

    }

    private static double discount_assigning(double amount) {
        if (amount >= 1000) {
            return 0.15;
        }
        else if (amount >= 500) {
            return 0.10;
        }
        else if (amount >= 250) {
            return 0.05;
        }
        else {
            return 0;
        }
    }
}
