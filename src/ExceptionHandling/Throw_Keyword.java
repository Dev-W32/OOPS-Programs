package ExceptionHandling;

public class Throw_Keyword {
    public static void main(String[] args) {
        Throw_Keyword t = new Throw_Keyword();
        t.divide();
      /* try {         // using try and catch in main method
            t.divide();
        }
        catch (ArithmeticException ee)
        {
            ee.printStackTrace();
        }   */
    }

    void divide()
    {
        int a=100,b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            // System.out.println(e);
            e.printStackTrace();
        }

    }
}
