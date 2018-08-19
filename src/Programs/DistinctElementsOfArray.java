package Programs;

import java.util.HashSet;

public class DistinctElementsOfArray {

    public static void main(String[]args)
    {
        int[] array = {3,5,4,2,3,5,6,4,3,6,7,1};

        int size = array.length;

        HashSet<Integer> integerSet = new HashSet<>();

        for(int integer : array)
        {
            if(integerSet.add(integer)==true)
            {
                System.out.println("This is distinct element " + integer);
            }
        }
    }
}
