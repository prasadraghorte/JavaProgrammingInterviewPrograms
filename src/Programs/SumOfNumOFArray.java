package Programs;

public class SumOfNumOFArray {

    /**
     * WAP to claculate the sum of all numbers of an array
     */

    public static void main(String[]args)
    {
        int[]arr = {4,6,2,3,5,8,5,2,4};
        int sum = 0;

        for(int a : arr)
        {
            sum = sum + a;
        }

        System.out.print("Sum is "+ sum);
    }
}
