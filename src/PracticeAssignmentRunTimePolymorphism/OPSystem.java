/*
package PracticeAssignmentRunTimePolymorphism;


class OperatingSystem{
    static void display(){
        System.out.println("\n\nOperating System");
    }
    void feature(){

        System.out.println("\n-Manipulation of the file system. \n- Error Detection and handling. \n-Resource allocation.");

    }
}
class DOS extends OperatingSystem{
    static void display(){
        System.out.println("DOS");
    }
    void feature(){

        System.out.println("\n-It is a single user system. \n-It controls program. \n- It is machine independence.");
    }
}
class Window extends DOS{
    static void display(){

        System.out.println("\n\nWindow");
    }
    void feature(){

        System.out.println("\n-Start Menu. \n-Multiple Desktops. ");

    }
}
class WindowMobile extends Window{
    static void display(){
        System.out.println("Window Mobile");
    }
    void feature(){

        System.out.println("New Sense feature for Windows Phone users \n-Slew of new delights \n- Upgraded imaging experience.");

    }

}

class Main{
    public static void main(String[] args) {
        OperatingSystem obj1 = new OperatingSystem();
        OperatingSystem.display();
        obj1.feature();
        OperatingSystem obj2 = new DOS();
        DOS.display();
        obj2.feature();
        DOS obj3 = new Window();
        Window.display();
        obj3.feature();
        Window obj4 = new WindowMobile();
        WindowMobile.display();
        obj4.feature();
    }
}
*/
