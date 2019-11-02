public class PrimeFactors
{
    public static void printPrimeFactors(int n)
    {
        for(int i = 2; i < n; i++) 
        {
            while(n%  i == 0) 
            {
               System.out.println(i + " ");
               n = n / i;
            }
         }
         if(n > 2) 
        {
            System.out.println(n);
         }
    }

    public static void main(String [] args)
    {
        printPrimeFactors(12);
    }
}