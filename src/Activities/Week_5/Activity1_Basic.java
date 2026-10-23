package Activities.Week_5;

public class Activity1_Basic extends Arrays_Main{
    public static void main() {

//        INITIALIZATIONS
        String[] favoriteThings = {"Food", "Sleep", "Gaming", "Anime", "Her"};

//        OUPUT
        System.out.println("\n\n=========================\n BASIC ACTIVITY\n=========================\n\n" +
                "My Favorite Things:");
                print_fave(favoriteThings);
                System.out.println("\nSize of the Array: " + favoriteThings.length);

    }

    private static void print_fave(String[] array) {
        int index = 0;
        final int MAX = array.length;

        while (index < MAX ) {
            System.out.println((index + 1) + ". " + array[index]);
            ++index;
        }

    }
}
