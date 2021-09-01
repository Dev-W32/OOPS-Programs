package ExceptionHandling;

public class TestThrowUncheckedExp {

    static void method() throws ArithmeticException
    {
        System.out.println("Inside the method");
        int a=100,b=0,c;
        c=a/b;
        throw new ArithmeticException("Arithemetic exception occours");

    }

    public static void main(String[] args) {
        try {
            method();
        }
       catch (ArithmeticException e)
       {
            e.printStackTrace();
       }
        System.out.println("Hello");
    }
}
