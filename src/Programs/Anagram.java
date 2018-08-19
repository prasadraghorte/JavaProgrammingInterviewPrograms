package Programs;

public class Anagram {
    /**
     * Program to check if the given string is anagram or not i.e. the combination of characters in 1st string
     * abc - bca
     * @param args
     */
    public static void main(String[]args)
    {
        String str1= "abc";
        String str2="bca";

        char[]Array1 = str1.toCharArray();
        //We will craete string builder object so that we can delete char in string 2
        StringBuilder builder = new StringBuilder(str2);
        for(char ch : Array1)
        {
            int index = builder.indexOf(""+ch);//""+ch will convert char to string
            //indexOf method will return -1 if no character is matching
            if(index!=-1)
            {
                builder.deleteCharAt(index);
            }
        }

        if(builder.length()==0)
        {
            System.out.println("Provided strings are anagram.");
        }
        else
        {
            System.out.println("Provided strings are not anagram");
        }
    }
}
