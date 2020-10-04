package tudelft.numfinder;

public class NumFinderMain
{

    public static void main (String[] args)
    {
        NumFinder nf = new NumFinder();

        // this works
         //nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        //nf.find(new int[] {4, 3, 2, 1});

        // New case
        nf.find(new int[] {-4, 3, -1, 5, -2});

        System.out.println("Largest = " + nf.getLargest());
        System.out.println("Smallest = " + nf.getSmallest());
    }
}
