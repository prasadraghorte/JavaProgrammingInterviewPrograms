package Programs;

public class SwapStrings {
    /**
     * Swap 2 strings without using 3rd strings
     */

    public static void main(String[]args)
    {
        String a = "Prasad";
        String b = "Raghorte";

        a=a+b;

        b=a.substring(0,a.length()-b.length());

        a=a.substring(b.length());

        System.out.print(a+" "+b);
    }
}
