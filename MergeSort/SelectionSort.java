import java.util.Arrays;
public class SelectionSort
{
    public static void sort(int[] a)
    {
        for (int i=0; i<a.length; i++)
        {
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
            
        }
    }
    
    private static int minimumPosition(int[] a, int from)
    {
        int minPos = from;
        for (int i = from + 1; i<a.length; i++)
        {
            if (a[i] < a[minPos])
            {
                minPos = i;
            }
        }
        return minPos;
    }
    
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));
        SelectionSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}