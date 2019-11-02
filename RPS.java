public class RPS
{
    public static void rockPaperS(String s)
    {
        s = s.toLowerCase();
        while(s.length() > 0)
        {
            char c = s.charAt(0);
            if(c == 'r')
                rock();
            if(c == 's')
                sci();
            if(c == 'p')
                paper();
            s = s.substring(1);
        }
    }

    private static void rock()
    {
        System.out.print("p");
    }

    private static void sci()
    {
        System.out.print("r");
    }

    private static void paper()
    {
        System.out.print("s");
    }
    
}