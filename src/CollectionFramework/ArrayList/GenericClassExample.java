package CollectionFramework.ArrayList;

import javax.swing.*;

class MyData<T>{

        T i;       //     T i; replacing int with T
        public void add(T i1)
        {
            i=i1;
        }
        public T get()
        {
            return (i);
        }
}

public class GenericClassExample {
    public static void main(String[] args) {
      //  T k = new T(5);

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        integerBox.add(new Integer(10));
        stringBox.add(new String("Devesh"));

        System.out.println("M1 <Integer> "+integerBox.get()+"\n"+"M2 <String> "+stringBox.get()+"\n");

    }
}

class Box<T>{
    private  T t;
    public void add(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
}
