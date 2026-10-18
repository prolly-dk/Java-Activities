package Main_Package.Data_Type_Variables;

public class Advanced extends Data_Types_Variables_Main {
    public static void main() {
//        INITIALIZATIONS
        double originalCentimeters = 425.33;

//        CALCULATIONS & TYPE CASTING
        int convertedMeter = (int) originalCentimeters;
        double convertedCentimeter = originalCentimeters - convertedMeter;

        double widenedMeter = convertedMeter; /* Widening does not need explicit cast typing because the byte storage will still accomodate the data that will be converted into a bigger storage */
        int narrowedCentimeter = (int) originalCentimeters; /* Narrowing needs explicit cast typing because the byte storage of the smaller byte storage will cut or truncate certain details about the original data and can lead to errors*/

        System.out.println("\n\n=========================\n ADVANCED ACTIVITY\n=========================\n\n" +
                "Original (cm): " + originalCentimeters + "\n" +
                "Converted (m, cm): " + convertedMeter + ", " + convertedCentimeter + "\n" +
                "Widened: " + widenedMeter + "\n" +
                "Narrowed: " + narrowedCentimeter);
    }
}
