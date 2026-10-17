package Main_Package.Data_Type_Variables;

public class Expert extends Data_Types_Variables_Main {
    static void main() {
//        INITIALIZATIONS
         byte overflowDemo = 127;
         String stringObject1 = new String("Bread");
         String stringObject2 = new String("Bread");
         String stringLiteral = "Bread";

//       PRINTING
        System.out.println("\n\n=========================\n EXPERT ACTIVITY\n=========================\n\n" +
                "Overflowing Byte: " + ++overflowDemo + "\n" +
                "String Object == String Object: "  + (stringObject1 == stringObject2) + "\n" +
                "String Object .equals() String Object: " + (stringObject1.equals(stringObject2)) + "\n" +
                "String Object == String Literal: " + (stringObject1 == stringLiteral) + "\n" +
                "String Object .equals() String Literal: " + (stringObject1.equals(stringLiteral)));

        /*  The comparison operator returns false when used is because every string is a new object, thus returning false
        * Meanwhile .equals() compares the content of the string instead of comparing whether they are the same object  */
    }
}
