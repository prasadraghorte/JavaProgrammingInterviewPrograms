package Programs;

public class Pattern2 {
    /**
     * Write a program to dra pattern like this
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4 5 6
     * 1 2 3 4 5 6 7
     * 1 2 3 4 5 6
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */

    public static void main(String[]args)
    {
        for (int i =1; i<8; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        for (int x=6; x>=1;x--)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
