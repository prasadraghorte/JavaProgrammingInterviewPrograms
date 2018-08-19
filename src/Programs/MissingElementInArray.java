package Programs;

public class MissingElementInArray {
    /**
     * WAP to print missing number in an array
     */

    public static void main (String[]args)
    {
        int[]arr = {1,2,3,4,6,7,8,9};
        int size = (arr.length)+1;

        int expectedSum = (size*(size+1)/2);
        int actualSum = 0;

        for(int a:arr)
        {
            actualSum = actualSum + a;
        }

        int desiredNum = (expectedSum - actualSum);
        System.out.println(desiredNum);
    }
}
