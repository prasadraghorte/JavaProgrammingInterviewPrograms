package Programs;

public class CompressString {
    /**
     * Write a prog to coompress strings say String = aaabbccccd so output should be a3b2c4d1
     * @param args
     */

    public static void main (String[]args)
    {
        String str = "aaabbccccd";
        int counter = 0;
        char temp = str.charAt(0);

        for(int i =0; i<str.length();i++)
        {
            if(temp==str.charAt(i))
            {
                counter++;
            }
            else
            {
                System.out.print(temp+""+counter);
                temp = str.charAt(i);
                counter = 1;
            }
        }
        System.out.print(temp+""+counter);
    }
}
