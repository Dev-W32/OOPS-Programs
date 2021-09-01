class A{
    final int a; //static blank final variable
    A(int b)
    {
        a=b;
    }
    public static void main(String args[])
    {
        A a1 =new A(10);
        System.out.println(A.a);
    }
}