import java.util.Scanner;
public class One
{
    public static void isOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number");
        
        int a = Integer.parseInt(s.nextLine());
        isOdd(a);
    }
}