package Tutorials;

interface Testing{
    void print();
    void Hello();
}

public class Interfaces {

    public static void main(String[] args) {

        Testing t = new Testing() {

            public void print() {
                System.out.println("Anonymous class");
            }
            public void Hello()
            {
                System.out.println("Hello override method");
            }
        };
        t.print();
        t.Hello();
    }



}


