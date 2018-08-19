package Programs;

public class Armstrong {
    /**
     * Armsstrong number si the number in which sum ob cubes of the digits is the number itself
     */

    public static void main (String[]args)
    {
        int n = 371;
        int c=0,a, temp;
        temp=n;

        while(temp>0)
        {
            a=temp%10;
            temp=temp/10;
            c=c+(a*a*a);
        }

        if(c==n)
        {
            System.out.print("Num is armstrong");
        }
        else{
            System.out.print("Num is not armstrong");
        }
    }
}
