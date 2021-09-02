package ExceptionHandling;
class Parent2{
    //defining method
    void msg() throws ArithmeticException
    {
        System.out.println("Parent method");
    }

}

public class TestExceptionChild2 extends Parent2{
    // overriding method in child class
    // There is no compile time error even if child class dosent declare exception
    // But no need of writing throws and exception name in child class
    void msg() /*no need of this but still writing this lol*/ throws ArithmeticException //throws IOException will result in error
    {
        System.out.println("TestExceptionChild2");
    }

    public static void main(String[] args) {
        Parent2 p2 = new TestExceptionChild2();
        p2.msg();
    }
}
