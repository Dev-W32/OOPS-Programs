package ComparatorInterface;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name;
    int age,rollno;
    Student(int age,String name,int rollno)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}

public class NameAndAgeComparator {
    public static void main(String[] args) {
        Student st = null;
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(19,"Devesh",32));
        al.add(new Student(20,"Himnish",34));
        Iterator it1 = al.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}