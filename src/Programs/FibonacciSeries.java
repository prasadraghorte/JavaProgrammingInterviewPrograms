package Programs;

/**
 * Write a program to print fibonacci series of 10
 * it is sum of previous 2 numbers
 * 0 1 1 2 3 5 8 13 21 34 55 89
 */

public class FibonacciSeries {

    public static void main (String [] args)
    {
        int firstNum = 0;
        int secNum = 1;
        System.out.print(firstNum+" "+secNum);

        for(int i=0; i<10; i++)
        {
            int thirdNum = firstNum+secNum;
            System.out.print(" "+thirdNum);
            firstNum = secNum;
            secNum = thirdNum;
        }
    }
}
