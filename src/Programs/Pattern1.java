package Programs;

import java.util.ArrayList;

/**
 * WAP to draw pattern like this
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8
 */

public class Pattern1 {

    public static void main (String []args)
    {
        ArrayList<Integer> integ = new ArrayList<Integer>();
        int startNum = 1;

        for(int i = 1; i <=8; i++)
        {
            integ.add(i);
            System.out.println(integ);
        }

       /* o/p :
        [1]
        [1, 2]
        [1, 2, 3]
        [1, 2, 3, 4]
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5, 6]
        [1, 2, 3, 4, 5, 6, 7]
        [1, 2, 3, 4, 5, 6, 7, 8]*/

       for(int x=1; x<=8;x++)
       {
           for(int y=1; y<=x; y++)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       /*o/p :
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
        1 2 3 4 5 6 7 8*/

       for(int m =1; m<=8; m++)
        {
            for(int n = 1; n<=m; n++)
            {
                System.out.print(m+" ");
            }
            System.out.println("");
        }
    }
}
