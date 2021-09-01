package PracticeAssignmentRunTimePolymorphism;

public class OperatingSystem {
    static double version;
    static int NoOfBits;

    void feature() {
        System.out.println("Here we have 3 Operating Systems: \n1. DOS\n2. Windows\n3. Windows Mobile");
    }
}

class Dos extends OperatingSystem {
    void feature() {
        System.out.println("\nDOS Operating System");
        OperatingSystem.version = 8.0;
        OperatingSystem.NoOfBits = 16;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);

    }
}

class Windows extends Dos {
    void feature() {
        System.out.println("\nWindows Operating System");
        OperatingSystem.version = 11;
        OperatingSystem.NoOfBits = 64;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);
    }
}

class WindowsMobile extends Windows {
    void feature() {
        System.out.println("\nWindows Mobile Operating System");
        OperatingSystem.version = 10.0;
        OperatingSystem.NoOfBits = 32;
        System.out.println("Operating system version: " + OperatingSystem.version);
        System.out.println("Number of bits: " + OperatingSystem.NoOfBits);
    }
}

class mainClass {
    public static void main(String[] args) {
        OperatingSystem m1 = new OperatingSystem();
        m1.feature();
        OperatingSystem m2 = new Dos();
        m2.feature();
        Dos m3 = new Windows();
        m3.feature();
        Windows m4 = new WindowsMobile();
        m4.feature();


    }
}



