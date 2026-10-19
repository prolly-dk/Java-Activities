package Activities.Week_3;


public class Activity3_Advanced extends Control_Flow_1_Main {

//    GLOBAL INITIALIZATION
    private static final String USER_NAME = new String("prolly_dk");
    private static final String PASSWORD = new String("My_Pass123");

    public static void main() {
//        LOCAL INITIALIZATION
        String inputUserName = new String("Dk");
        String inputPassword = new String("Password123");
        boolean accountLockedStatus = true;

//        OUTPUT
        System.out.println("\n\n=========================\n ADVANCED ACTIVITY\n=========================\n\n" +
//                CASE 1: WRONG USERNAME
                "Username: " + inputUserName + "\n" +
                "Password: " + inputPassword);
                check_credentials(inputUserName, inputPassword, accountLockedStatus);

//                CASE 2: WRONG PASSWORD
                inputUserName = new String("prolly_dk");
                System.out.println("\nUsername: " + inputUserName + "\n" +
                        "Password: " + inputPassword);
                check_credentials(inputUserName, inputPassword, accountLockedStatus);

//                CASE 3: LOCKED ACCOUNT
                inputPassword = new String("My_Pass123");
                System.out.println("\nUsername: " + inputUserName + "\n" +
                        "Password: " + inputPassword);
                check_credentials(inputUserName, inputPassword, accountLockedStatus);

//                CASE 4: SUCCESSFUL LOG IN
                accountLockedStatus = false;
                System.out.println("\nUsername: " + inputUserName + "\n" +
                        "Password: " + inputPassword);
                check_credentials(inputUserName, inputPassword, accountLockedStatus);



    }

    private static void check_credentials(String name, String password, boolean locked) {
        if (name.equals(USER_NAME)) {
            if (password.equals(PASSWORD)) {
                if (!locked) {
                    System.out.println("ACCOUNT ACCESSED!");
                }
                else  {
                    System.out.println("ACCOUNT LOCKED");
                }
            }
            else {
                System.out.println("WRONG PASSWORD");
            }
        }
        else {
            System.out.println("WRONG USERNAME");
        }
    }

}
