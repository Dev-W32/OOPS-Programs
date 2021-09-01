package Assignment7;

@FunctionalInterface
interface Area1 {

    void Area();
}

interface Area2 {
    void Area(float length, float breadth);
}

interface Area3 {
    void Area(float length, float breadth, float height);
}

class MainClass {
    public static void main(String[] args) {


        Area1 cube = () -> {
            float length=40.1F;
            System.out.println("Area of cube: " + 6 * length * length);};

        Area2 rectangle = (length, breadth) -> System.out.println("Area of rectangle: " + length * breadth);

        Area3 cuboid = (length, breadth, height) -> System.out.println("Area of cuboid: " + 2 * (length * breadth + breadth * height + height * length));

        cube.Area();
        rectangle.Area(33F, 44.5F);
        cuboid.Area(23.5F, 4.6F, 22F);
    }
}