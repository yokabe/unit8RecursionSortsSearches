import java.util.Arrays;
import java.util.Random;
public class BubbleSort
{
    private static Random generator = new Random();
    public static void main(String[] args)
    {
        boolean sorted = false;
        
        int[] a = new int[10];      
        for (int i = 0; i < a.length; i++)
        {
            a[i] = generator.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        
        int first;
        
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 1; j < (a.length-i); j++)
            {
                if (a[j-1] > a[j])
                {
                    first = a[j];
                    a[j] = a[j-1];
                    a[j-1] = first;
                }
            }
        }
        
        
        System.out.println(Arrays.toString(a));
    }
}