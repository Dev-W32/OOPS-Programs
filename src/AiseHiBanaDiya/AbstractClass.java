package AiseHiBanaDiya;

abstract class Figure
{
     void display()
    {
        System.out.println("Used to display data members");
    }
}
class open extends Figure
{
    open()
    {
        System.out.println("Upcasted from figure");
    }
    void display(String name)
    {
        System.out.println("Used to display "+name+" structures");
    }
}
class close extends Figure{
    close()
    {
        System.out.println("Upcasted from figure");
    }
    void display(String name)
    {
        System.out.println("Used to display "+name+" structures");
    }
}
class polygon extends close{

    int noOfSides;
    polygon(int noOfSides)
    {
        this.noOfSides=noOfSides;
        System.out.println("Upcasted from AiseHiBanaDiya.close");
        System.out.println("This AiseHiBanaDiya.polygon has "+noOfSides+" sides");
    }
    void display()
    {
        System.out.println("A AiseHiBanaDiya.polygon should have minimum 3 sides");
    }

}
class eclipse extends  close{
    eclipse()
    {
        System.out.println("Upcasted from AiseHiBanaDiya.close");
    }
    void display()
    {
        System.out.println("An ellipse is a shape that looks like an oval or a flattened circle");
    }
}

class line extends open{
    int length;
    line(int length)
    {
        this.length=length;
        System.out.println("Length of the AiseHiBanaDiya.line is: "+length);
    }
    void display()
    {
        System.out.println("Line has length: "+length+ " It should always be straight.");
    }

}
class polyline extends open{
    int noOfPoints;
    polyline(int noOfPoints)
    {
        this.noOfPoints=noOfPoints;
        System.out.println("This AiseHiBanaDiya.polyline has "+noOfPoints);
    }
    void display(int noOfPoints)
    {
        System.out.println("A Polyline with "+noOfPoints+ " is a shape defined by one or more paths, in which a path is a series of connected segments.");
    }
}

class mainClass {
    public static void main(String[] args) {
        Figure figo = new open();
        figo.display();
        /*AiseHiBanaDiya.open op = new AiseHiBanaDiya.open();
        op.display("AiseHiBanaDiya.open");*/
        figo.display();
        Figure figc = new close();
        figc.display();
        close cl = new close();
        cl.display("Closed");
        close poly = new polygon(7);
        polygon pol = new polygon(4);
        pol.display();
        close ecl = new eclipse();



    }
}
