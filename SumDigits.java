public class SumDigits
{
    public static void addSum(int n)
    {
        int sum = 0; 
        
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 

        System.out.println(sum);
    }
    public static void main(String [] args)
    {
        addSum(1204);
    }
}