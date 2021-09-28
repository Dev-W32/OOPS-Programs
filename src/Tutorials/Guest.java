package Tutorials;

public class Guest {
    public static void main(String[] args) {
        Box<Integer,Integer> box1  = new Box<Integer,Integer>();
        Number n=9;
        double sum=0;
        sum+=n.doubleValue();
        System.out.println(sum);
        System.out.println("First "+box1.getFirst());
        System.out.println("Second "+box1.getSecond());
        Box<Double,Integer> box2 = new Box<Double,Integer>();

        System.out.println("First "+box2.getFirst());
        System.out.println("Second "+box2.getSecond());
        System.out.println(box1.compare(23,78));
    }
}

class Box<T extends Number & Comparable<T>,S extends Number>
{
    private  T t1,t2,max;
    private S s;
    public void add(T t1,T t2, S s)
    {
        this.t1=t1;
        this.t2=t2;
        this.s=s;
    }
    public T getFirst()
    {
        return t1;
    }
    public S getSecond()
    {
        return s;
    }
    public T get_t2()
    {
        return t2;
    }

    public T compare(T t1,T t2)
    {
        if(t1.compareTo(t2)>0)
        {
            return t1;
        }
        else return t2;
    }
}
