package josbert_new_;

public class string_demo_4_ {

    public static void main(String args[]) {
        // Declaring and initializing a character array
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        // Declaring and initializing an empty string
        String Str2 = "";

        // Copying the values of the character array into the string
        Str2 = Str2.copyValueOf(Str1);

        // Printing the string containing the copied values
        System.out.println("Returned String: " + Str2);

        // Copying a specific range of values from the character array into the string
        Str2 = Str2.copyValueOf(Str1, 3, 6);

        // Printing the string containing the copied subrange of values
        System.out.println("Returned String: " + Str2);
    }
}
