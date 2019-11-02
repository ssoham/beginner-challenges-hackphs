import java.util.Arrays;

public class MeanMed
{
    public static void diffMeanMed(int [] arr)
    {
        Arrays.sort(arr);
        double med = -1;
        int n = arr.length;
        if(n % 2 != 0)
            med = (double)arr[n/2];
        else
            med = (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        
        
        double mean = 0;
        for(int s: arr)
            mean += s;
        
        mean /= n;

        System.out.println(mean - med);
    }

    public static void main(String [] args)
    {
        int [] a = {1, 2, 3, 4, 5, 9};
        diffMeanMed(a);
    }
}