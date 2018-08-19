package Programs;

public class PrimeNumbers {

    /**
     * Program to check if a number is prime or not?
     * prime number is divisible by 1 or itself
     * ex: 1 2 3 5 7 11 13.....
     * @param args
     */

    public static void main(String[]args)
    {
        int num = 4;
        boolean flag = false;
        for(int i = 2; i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
            else
            {
                flag = false;
            }
        }
        if(flag) {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
    }
}
