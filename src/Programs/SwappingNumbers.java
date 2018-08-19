package Programs;

public class SwappingNumbers {

    /**
     * Swapping 2 numbers
     */
    public static void main (String[]args)
    {
        int x=6;
        int y=4;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.print("x:"+x+" y:"+y);
    }
}
