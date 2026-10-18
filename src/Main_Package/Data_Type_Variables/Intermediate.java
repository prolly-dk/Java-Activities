package Main_Package.Data_Type_Variables;

public class Intermediate extends Data_Types_Variables_Main {
    public static void main() {
//        INITIALIZATIONS
        int quantity = 25;
        double unitPrice = 39.99;
        String storeName = "DAN'S BREAD STORE", productName = "Cinnamon Roll";

//        CALCULATIONS
        double totalCost = quantity * unitPrice;
        /* totalCost needs to be a double to account for decimals
            or floating point that the calculation will return */

//        OUTPUT

        System.out.println("\n\n=========================\n INTERMEDIATE ACTIVITY\n=========================\n\n" +
                "Shop Name: " + storeName + "\n" +
                "Product: " + productName + "\n" +
                "Quantity" + quantity + "\n" +
                "Unit Price: " + unitPrice + "\n" +
                "Total Cost: " + totalCost);
    }
}
