package Programs;

public class CompareTwoArray {
    /**
     * Program to find common integers from 2 distinct array
     * @param args
     */

    public static void main(String []args)
    {
        int[]Arr1= {3,5,7,4,5,2,5,8};
        int[]Arr2= {4,8,7,1,6,9,7,5};
        for(int i =0; i< Arr1.length;i++)
        {
            for(int j=0;j<Arr2.length;j++)
            {
                if(Arr1[i]==Arr2[j])
                {
                    System.out.println("This element is common "+ Arr1[i] );
                }
            }
        }
    }
}
