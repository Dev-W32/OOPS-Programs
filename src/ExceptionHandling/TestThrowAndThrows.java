package ExceptionHandling;
//Throw keyword with unchecked expression
public class TestThrowAndThrows {
    static void method(int num) throws ArithmeticException
    {
        if(num<1)
        {
            throw new ArithmeticException("Number is negative");
        }
        else
        {
            System.out.println("It is a positive number");
        }
    }

    public static void main(String[] args) {
        try {
            method(-3);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught");

        }
        System.out.println("Rest of the code");
    }
}
