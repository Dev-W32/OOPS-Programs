package Assignment8;

import java.util.Scanner;

class Employee {
    String Departname, name;
    int ID;
    String membersID;

    public void Display() {
        System.out.println("Name: " + this.name);
        if (ID < 10)
        {
            this.membersID = this.Departname + "00" + this.ID;
            System.out.println(" ID: " + this.membersID);
        }
        else
        {
            this.membersID = this.Departname + "0" + this.ID;
            System.out.println(" ID: " + this.membersID);
        }

    }

}

class DepartmentException extends Exception
{
    public DepartmentException(String e) {
        super(e);
    }
}

class IDException extends Exception {
    public IDException(String e) {
        super(e);
    }
}

class ASGexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee myEmp = new Employee();
        System.out.println("Enter Name:");
        myEmp.name = sc.nextLine();
        String Department;

        try {
            System.out.println("Enter Department Name(CS,IT,EC): ");
            Department = sc.nextLine();
            if (Department.equals("CS") || Department.equals("EC") || Department.equals("IT")) {
                myEmp.Departname = Department;
            } else {
                throw new DepartmentException("Invalid Department \n(Please Choose department CS,EC or IT)");
            }
            try {
                System.out.println("Enter ID: ");
                myEmp.ID = sc.nextInt();
                if (myEmp.ID > 0 && myEmp.ID <= 50) {
                    myEmp.Display();
                } else {
                    throw new IDException("Invalid ID \n(Please Enter the ID between 1 to 50)");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

