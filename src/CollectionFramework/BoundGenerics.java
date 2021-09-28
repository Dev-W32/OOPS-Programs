package CollectionFramework;


public class BoundGenerics {
    public static  <T extends Number & Comparable<T>> T Maximum(T x,T y,T z)
    {
        T max = x;
        if(y.compareTo(max)>0)    // We cannot write y>x directly
        {
            max = y;
        }
        if(z.compareTo(max)>0)
        {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Integers"+Maximum(4,5,6));
    }
}
