package ExceptionHandling;
// Exception handling in method overriding

import java.io.*;
class Parent{
    //defining method
    void msg() throws ArithmeticException
    {
        System.out.println("Parent method");
    }

}

public class TestExceptionChild extends Parent{
    // overriding method in child class
    // There is no compile time error even if child class dosent declare exception
    void msg() throws ArithmeticException //throws IOException will result in error
    {
        System.out.println("TestExceptionChild");
    }

    public static void main(String[] args) {
        Parent p = new TestExceptionChild();
        p.msg();
    }
}
