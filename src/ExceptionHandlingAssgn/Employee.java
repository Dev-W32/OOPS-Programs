package ExceptionHandlingAssgn;

import java.util.Scanner;

class Exception extends RuntimeException{
    Exception(String str)
    {
        super(str);
    }
}

public class Employee extends RuntimeException {
    static int i;
    String DeptName,name;

    void getData(String Name, String Deptname) {
        this.name = Name;
        this.DeptName = Deptname;
        if(Deptname.startsWith("CS") || Deptname.startsWith("IT") || Deptname.startsWith("EC")){
            System.out.print("ID: "+Deptname);
            System.out.format("%03d",i);
            System.out.println("\n"+"Department: "+Deptname+"\n");
        }
            else throw new Exception("ID does not match");
    }


    public static void main(String[] args) {
        Employee em = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department: 1. CS\n2. IT\n3. EC");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("CS Department");
                for(i=1; i<=50; i++)
                {
                    System.out.println("Enter Name and ID");
                    em.getData(sc.next(), sc.next().toUpperCase());
                    System.out.println("Count ="+i+"\n");
                    if(i>50)
                    {
                        throw new Exception("Count exceeded 50");
                    }
                }

            case 2:
                System.out.println("IT Department");
                for(i=1; i<=50; i++)
                {
                    System.out.println("Enter Name and ID");
                    em.getData(sc.next(), sc.next().toUpperCase());
                    System.out.println("Count ="+i+"\n");
                    if(i>50)
                    {
                        throw new Exception("Count exceeded 50");
                    }
                }

            case 3:
                System.out.println("EC Department");
                for(i=1; i<=50; i++)
                {
                    System.out.println("Enter Name and Department. ");
                    em.getData(sc.next(), sc.next().toUpperCase());
                    System.out.println("Count ="+i+"\n");
                    if(i>50)
                    {
                        throw new Exception("Count exceeded 50");
                    }
                }
        }




    }
}
