package Programs;

/**
 * Program to extract the numers from a string
 */

public class ExtractNumerals {

    public static void main(String[]args)
    {
        String str = "ABCDEF12345";

        String result = str.replaceAll("[^0-9]", "");

        System.out.println(result);
    }
}
