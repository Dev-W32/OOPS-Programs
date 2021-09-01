package Assignment5;

abstract class Figure
{
    abstract void display();
}

class open extends Figure{
    open()
    {
        System.out.println("Open shapes are line and polyline\n");
    }
    void display()
    {
        System.out.println("Displaying open figures");
    }
}

class close extends Figure{
    close()
    {
        System.out.println("Closed shapes are polygon and eclipse\n");
    }
    void display()
    {
        System.out.println("Displaying closed figures");
    }
}
class polygon extends close{
    polygon()
    {
        System.out.println("polygon is a closed shaped figure");
    }
    void display()
    {
        System.out.println("Displaying polygon");
    }
}
class eclipse extends close{
    eclipse()
    {
        System.out.println("Eclipse is a closed shaped figure");
    }
    void display()
    {
        System.out.println("Displaying eclipse");
    }
}

class line extends open{
    line()
    {
        System.out.println("line is open figure");
    }
    void display()
    {
        System.out.println("Displaying line");
    }
}
class polyline extends open{
    polyline()
    {
        System.out.println("polyline is open figure");
    }
    void display()
    {
        System.out.println("Displaying polyline");
    }
}

class mainClass{
    public static void main(String[] args) {
        /*Figure op = new open();
        op.display();
        Figure cl = new close();
        cl.display();*/
        Figure polygon = new polygon();
        polygon.display();
       Figure eclipse = new eclipse();
        eclipse.display();
        line line = new line();
        line.display();
        System.out.println("\n");
        polyline polyline = new polyline();
        polyline.display();
    }
}