package Tutorials;

abstract class Hello{
    abstract void Method();
     void Method2(){
        System.out.println("hello world");
    }
}
public class AbstractTut extends Hello {

    void Method()
    {
        System.out.println("Hello from extended abstract class ");
    }

    public static void main(String[] args) {
        AbstractTut p = new AbstractTut();
        p.Method();
        p.Method2();
    }
}
