import java.util.Scanner;

public class Box {
    float height,width,depth;
    static int count=0;
    static float Area(int h,int w,int d)
    {
        int Area=2*h*w+2*w*d+2*h*d;
        return Area;
    }
    static void DisplayCount()
    {
        Box.count++;
        System.out.println("Count "+Box.count);
    }
    void Display()
    {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),d=sc.nextInt();
        System.out.println("Height: "+h+"\nWidth: "+w+"\nDepth: "+d);
        System.out.println("Area is: "+Area(h,w,d));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box bx = new Box();
        System.out.println("Press 1 to calculate Area or press any key to exit");
        while(sc.nextInt()==1)
        {
            System.out.println("Enter height width and depth");
            bx.Display();
            DisplayCount();
            System.out.println("Press 1 again to calculate area again or any other key to exit");
        }
    }
}
