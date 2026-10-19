package Activities.Week_3;


public class Activity4_Expert extends Control_Flow_1_Main {

//    GLOBAL INITIALIZATION
    private static final String USER_NAME = new String("prolly_dk");
    private static final int PIN = 7425;
    private static double current_balance = 15250.45;


    public static void main() {
//        INITIALIZATION
        String inputName = new String("prolly_dk");
        int inputPIN = 7425;
        double withdrawAmount = 3000;
        int limitIndex = 0, rateIndex = 1;

//        PROCESS
        String accountTier = check_account_tier(current_balance);
        double[] tierValues = tier_value_assignments(accountTier);
        double accountLimit = tierValues[limitIndex], feeRate = tierValues[rateIndex];

        double withdrawFee = withdrawAmount * feeRate;
        double total = withdrawAmount + withdrawFee;


//        OUTPUT
        System.out.println("\n\n=========================\n EXPERT ACTIVITY\n=========================\n\n" +
                "Username: " + inputName + "\n" +
                "PIN: "  + inputPIN);

        if (check_credentials(inputName, inputPIN)) {
            System.out.println("ACCOUNT ACCESSED \n");
        }
        else {
            return;
        }

        System.out.println("Balance: " + current_balance + "\n" +
                "Account Tier: " + accountTier + "\n" +
                "Withdraw Limit: " + accountLimit + "\n\n" +
                "Withdraw Amount: " + withdrawAmount + "\n" +
                "Fee: " + withdrawFee + "\n" +
                "Total: " + total + "\n");

        if (total < current_balance) {
             if (withdrawAmount <= accountLimit) {
                 System.out.println("Withdraw Status: APPROVED");
                 current_balance -= total;
                 System.out.println("New Balance: " + current_balance);
             }
             else {
                 System.out.println("Withdraw Status: DENIED - Exceed Account Withdraw Limit");
             }

        }
        else {
            System.out.println("Withdraw Status: DENIED - Not enough balance");
        }


    }

    private static boolean check_credentials(String name, int pin) {
        if (name.equals(USER_NAME)) {
            if (pin == PIN) {
                return true;
            }
            else {
                System.out.println("WRONG PIN");
                return false;
            }
        }
        else {
            System.out.println("WRONG USERNAME");
            return false;
        }
    }

    private static String check_account_tier(double balance) {

        if (balance > 1000000) {
            return "Platinum";
        }
        else if (balance >= 250000) {
            return "Gold";
        }
        else if (balance >= 50000) {
            return "Silver";
        }
        else if (balance >= 0) {
            return "Bronze";
        }
        else {
            return "In-Debt";
        }
    }

    private static double[] tier_value_assignments(String tier) {
        switch (tier) {
            case "Bronze":
                return new double[] {40000, 0.05};
            case "Silver":
                return new double[] {200000, 0.03};
            case "Gold":
                return new double[] {500000, 0.02};
            case "Platinum":
                return new double[] {2000000, 0.01};
            default:
                return new double[] {0, 0};
        }
    }

}
