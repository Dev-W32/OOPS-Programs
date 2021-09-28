package Assignment11;

public class Gen<T extends Number> {
    T[] nums;
    double sum=0,avg=0;
    public double average(T[] nums)
    {
        for (int i=0;i< nums.length;i++) {
            sum = sum + nums[i].doubleValue();
        }
         avg=sum/ nums.length;
        return avg;
    }
    public static boolean isAvgSame(Gen<?> a,Gen<?> b)
    {
        return a.avg == b.avg;
    }


    public static void main(String[] args) {
        Gen<Integer> calc1= new Gen<Integer>();
        Gen<Double> calc2= new Gen<Double>();
        Integer[] i1= {1,2,3,4,5};
        Double[] i2= {1.2,2.3,3.5,4.7,5.9};

        System.out.println(calc1.average(i1));
        System.out.println(calc2.average(i2));

        if(Gen.isAvgSame(calc1,calc2))
        {
            System.out.println("Averages are equal");
        }
        else System.out.println("Averages are not equal");


    }
}
