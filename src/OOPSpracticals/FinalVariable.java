package OOPSpracticals;

import java.util.Scanner;

public class FinalVariable {
   int a=20;
   FinalVariable(final int b)
   {
       b=a+b;
       System.out.println(b);
   }
}
class mainCl
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FinalVariable var = new FinalVariable(10);

    }
}
