package Programs;

public class Pattern8 {

    /**
     * WAP to draw pattern like this
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */

    public static void main(String []args)
    {
        int counter =1;
        for(int i =1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
        }
    }
}
