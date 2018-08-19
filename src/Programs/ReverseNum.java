package Programs;

public class ReverseNum {

    /**
     * WAP to reverse te given say 4765
     * Expected output is 5674
     */

    public static void main(String[]args)
    {
        int num = 4765;

        int reverse = 0;

        while(num!=0)
        {
            reverse = reverse*10+num%10;
            num = num/10;
        }
        System.out.print("Reverse num is "+reverse);
    }
}
