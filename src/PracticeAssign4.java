import java.util.Scanner;

class Student{
    public Student(String Name) {
        System.out.println(Name);
    }

    public Student() {
        System.out.println("UNKNOWN");
    }

   void DisplayName(String Name)
    {
        System.out.println("Student name is: "+Name);
    }

    public void DisplayName() {
    }
}

public class PracticeAssign4 {
    public static void main(String[] args)
    {
        Student s1 =new Student();
        Scanner sc = new Scanner(System.in);
        Student s2 = new Student(sc.next());
        s1.DisplayName();
        s2.DisplayName(sc.next());
    }
}
