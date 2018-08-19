package Programs;

import java.util.HashSet;

public class DuplicateCharsInString {
    /**
     * Program to find duplicate Chars in a string
     * We Can Achieve this using HashSet
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "Seleniumautomation";
        char[] chaArray = str.toCharArray();
        int size = chaArray.length;
        HashSet<Character> store = new HashSet<>();

        for(char ch: chaArray)
        {
            if(store.add(ch)==false)
            {
                System.out.println("This is the duplicate String "+ ch);
            }
        }
    }
}
