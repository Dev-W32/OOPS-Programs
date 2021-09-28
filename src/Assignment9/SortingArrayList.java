package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int marks, rollno;
    String name;

    public Student(int rollno, String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }
}

class SortByMarks implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}

class SortByName implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByRollNumber implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }
}

public class SortingArrayList {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(32, "Adam", 90));
        students.add(new Student(67, "Michael", 98));
        students.add(new Student(72, "Jonas", 89));
        students.add(new Student(69, "Noah", 78));
        students.add(new Student(43, "Mikkel", 99));
        Collections.sort(students, new SortByMarks());
        System.out.println("After sorting by marks: ");
        for (Student mark : students) {
            System.out.println("Name: " + mark.name + "\t Roll Number: " + mark.rollno + "\t Marks " + mark.marks);

        }
        System.out.println("\n");

        Collections.sort(students, new SortByName());
        System.out.println("After sorting by Name: ");
        for (Student name : students) {
            System.out.println("Name: " + name.name + "\t Roll Number: " + name.rollno + "\t Marks: " + name.marks);
        }
        System.out.println("\n");

        Collections.sort(students, new SortByRollNumber());
        System.out.println("After sorting by Roll Number: ");
        for (Student rolln : students)
        {
            System.out.println("Name: " + rolln.name + "\t Roll Number: " + rolln.rollno + "\t Marks: " + rolln.marks);
        }

    }
}
