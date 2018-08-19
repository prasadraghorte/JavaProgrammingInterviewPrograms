package Programs;

public class ReverseSentence {
    /**
     * WAP to reverse every word of sentence
     * "This is my program"
     * o/p : sihT si ym margorp
     * 2nd O/P : margorp ym si sihT
     * 3rd o/p : program my is This
     */

    public static void main(String[]args)
    {
        String str = "This is my program";
        String[] abc = str.split(" ");
        int size = abc.length;
        for(int i=0; i<size; i++)
        {
            String temp = abc[i];
            char[] tar = temp.toCharArray();
            int leng = tar.length;
            for(int j=leng-1; j>=0; j--)
            {
                System.out.print(tar[j]);
            }
            System.out.print(" ");
        }
        System.out.println("");

        /**
         * o/p 2:
         */
        
        String str1 = "This is my Program";
        String[] arr = str1.split(" ");

        size = arr.length;
        for(int i = size - 1; i>=0; i--)
        {
            char[] chArr = arr[i].toCharArray();
            int leng = chArr.length;
            for(int j = leng-1; j>=0; j--)
            {
                System.out.print(chArr[j]);
            }
            System.out.print(" ");
        }

        System.out.println("");

        /**
         * o/p 3 :
         */

        String str2 = "This is my Program";
        String[] arr1 = str2.split(" ");
        size = arr1.length;

        for(int i = size-1; i>=0; i--)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
