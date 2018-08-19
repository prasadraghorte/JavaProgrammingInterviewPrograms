package Programs;

public class Palindrome {

    /**
     * WAP to determine whether a given string is palindrome or not
     * Palindrome string s a string which remain same on reverse.
     */

    public static void main (String[]args)
    {
        String str = "RADAR";
        StringBuilder bl = new StringBuilder(str);
        String str2 = bl.reverse().toString();

        if(str2.equals(str))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }


        /**
         * Another way of doing this is :-
         */

        String str1= "abcdcba";
        int size = str1.length();

        for(int i =0; i<=size/2; i++)
        {
            if(str1.charAt(i)!=str1.charAt(size-i-1));
            {
                System.out.println("Provided strings are not palindrome");
            }
        }
    }
}
