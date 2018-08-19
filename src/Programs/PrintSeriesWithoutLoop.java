package Programs;

public class PrintSeriesWithoutLoop {
    /**
     * WAP to print 1 to 10 without using loop
     * @param args
     */
    public static void main(String[]args)
    {
        PrintSeriesWithoutLoop.printSeries(1);
    }

    public static void printSeries(int n)
    {

        if(n<=10)
        {
            System.out.println(n+" ");
            printSeries(n+1);
        }
    }
}
