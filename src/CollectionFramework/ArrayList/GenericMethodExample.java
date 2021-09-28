package CollectionFramework.ArrayList;

public class GenericMethodExample {

    public <E> void printarray(E[] s)   //<E> specifies that it is a generic method
    {
        for(int i=0; i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
       GenericMethodExample e1 = new GenericMethodExample();
       String[] countries = new String[]{"India","Nepal","Bhutan","Srilanka"};
       Integer[] Number ={1,2,3,4,5,6,7,8,9,10};
        e1.printarray(countries);
         e1.printarray(Number);   // without  <E> it would've given compile time error
        Double[] D = {1.3,6.5};
        e1.printarray(D);
    }
}
