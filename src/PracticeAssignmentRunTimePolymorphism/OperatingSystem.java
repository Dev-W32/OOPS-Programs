package PracticeAssignmentRunTimePolymorphism;

public class OperatingSystem {
    static double version;
    static int NoOfBits;

    static void display()
    {
        System.out.println("Operating System");
    }

    void feature() {
        System.out.println("Here we have 3 Operating Systems: \n1. DOS\n2. Windows\n3. Windows Mobile");
    }
}

class Dos extends OperatingSystem {
    static void display()
    {
        System.out.println("Dos");
    }

    void feature() {

        OperatingSystem.version = 8.0;
        OperatingSystem.NoOfBits = 16;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);

    }
}

class Windows extends Dos {
    static void display()
    {
        System.out.println("DOS");
    }
    void feature() {

        OperatingSystem.version = 11;
        OperatingSystem.NoOfBits = 64;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);
    }
}

class WindowsMobile extends Windows {
    static void display()
    {
        System.out.println("Windows Mobile");
    }
    void feature() {

        OperatingSystem.version = 10.0;
        OperatingSystem.NoOfBits = 32;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);
    }
}

class mainClass {
    public static void main(String[] args) {
        OperatingSystem m1 = new OperatingSystem();
        OperatingSystem.display();
        m1.feature();
        OperatingSystem m2 = new Dos();
        Dos.display();
        m2.feature();
        Dos m3 = new Windows();
        Windows.display();
        m3.feature();
        Windows m4 = new WindowsMobile();
        WindowsMobile.display();
        m4.feature();


    }
}



