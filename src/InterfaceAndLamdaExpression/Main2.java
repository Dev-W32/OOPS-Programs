package InterfaceAndLamdaExpression;

public class Main2 {
    public static void main(String[] args)
    {
        System.out.println("Hello from main class");
       MyInterface1 my = new MyInterfaceImpl();
        my.sayhello();
       MyInterface1 i1 = new MyInterface1()  {      //Upcasting
                public void sayhello(){
                    System.out.println("hello from anonymous class");
                }
            };
        i1.sayhello();
        MyInterface1 i = ()->{
            System.out.println("Hello from lamda expression");
        };
        i.sayhello();

        SumInterface1 sumI1 = ( a,b)-> {
            return a + b;
        };
        System.out.println(sumI1.sum(2, 5));
        LengthInterface1 len = (str -> str.length() );
        System.out.println(len.getlegth("hello"));
    }
}
