package OOPSpracticals;

import java.util.Scanner;

class Student
{
    String name;
    int rollNumber;
    float marks;
}
class myRecord extends Student
{
    void info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter Roll number: ");
        rollNumber=sc.nextInt();
        System.out.println("Enter percentage: ");
        marks=sc.nextFloat();

    }
}
class ManClass extends myRecord
{
   public static void main(String[] args)
   {
       myRecord rec = new myRecord();
       System.out.println("Name:"+rec.name+"\nRoll Number: "+rec.rollNumber+"\nPercentage: "+rec.marks+"%" );
   }
}

