package Programs;

public class GetTwoMaxNumInArray {

    /**
     * Get max two numbers in array
     */

    public static void main(String[]args)
    {
        int[]arr = {9,8,6,5,45,2,13,6,76};
        int FirstLarger = 0;
        int SecLarger = 0;
        for(int a:arr)
        {
            if(FirstLarger<a)
            {
                SecLarger = FirstLarger;
                FirstLarger = a;
            }
            else if (SecLarger<a)
            {
                SecLarger = a;
            }
        }
        System.out.print("First Large num "+FirstLarger +"and second large is "+SecLarger);
    }
}
