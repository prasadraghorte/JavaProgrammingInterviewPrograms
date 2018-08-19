package Programs;

public class StarPyramid {
    /**
     * o/p 1 :     *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *   * * * * * *
     *
     * o/p 2 :  *
     *          * *
     *          * * *
     *          * * * *
     *          * * * * *
     *          * * * * * *
     *
     *  o/p 3:
     *
     */

    public static void main(String[]args)
    {
        int n = 6;
        int k = 2*n;
        for(int i=0; i<n;i++)
        {
            for(int j = 0; j<k; j++)
            {
                System.out.print(" ");
            }
            k=k-2;
            for(int j = 0; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //o/p 2 :
        n = 6;
        for(int i=0; i<n;i++)
        {
            for(int j = 0; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //o/p 3:
        n=6;
        int a = 2*n;
        for(int i =0; i<n; i++)
        {
            for(int j =0; j<a; j++)
            {
                System.out.print(" ");
            }
            a=a-1;
            for(int x=0; x<=i; x++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
