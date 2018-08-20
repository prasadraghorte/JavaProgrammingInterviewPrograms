package Programs;

public class ChristmasTree {
    public static void main(String[]args)
    {
        int num =4;
        int k=5*num;
        for(int i=1;i<=4;i++)
        {
            for(int j =1; j<=k;j++)
            {
                System.out.print(" ");
            }
            k=k-1;
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        num=5;
        k=4*num;
        for(int i=2;i<=8;i++)
        {
            for(int j =1; j<=k-1;j++)
            {
                System.out.print(" ");
            }
            k=k-1;
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        num=7;
        k=3*num;
        for(int i=4;i<=12;i++)
        {
            for(int j =1; j<=k-4;j++)
            {
                System.out.print(" ");
            }
            k=k-1;
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        num=7;
        k=3*num;
        for(int i=2;i<=5;i++)
        {
            for(int j =1; j<=k-2;j++)
            {
                System.out.print(" ");
            }
            k=k-1;
            for(int j = 1; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
