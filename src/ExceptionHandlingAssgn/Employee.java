package ExceptionHandlingAssgn;

import java.util.Scanner;
class Employee{
    String DeptName,name;
    int ID;
    String membID;
    public void Display(){
        System.out.println("Name: "+this.name);
        if (ID<10) {
            this.membID = this.DeptName+"00"+this.ID;
            System.out.println("Member ID: "+this.membID);
        }
        else{
            this.membID = this.DeptName+"0"+this.ID;
            System.out.println("Member ID: "+this.membID);
        }

    }

}
class DepartmentException extends Exception {
    public DepartmentException(String e) {
        super(e);
    }
}
class CountException extends Exception {
    public CountException(String e) {
        super(e);
    }
}
 class ExceptionAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter Name:");
        emp.name = sc.nextLine();
        String Department;

        try {
            System.out.println("Enter Department Name: ");
            Department = sc.nextLine();
            if (Department.equals("CS")|| Department.equals("EC") || Department.equals("IT")) {
                emp.DeptName = Department;
            }
 else{
                throw new DepartmentException("Invalid Department. You can only choose between CS IT and EC");
            }
            try {
                System.out.println("Enter ID: ");
                emp.ID = sc.nextInt();
                if (emp.ID>0&& emp.ID<=50) {
                    emp.Display();
                }
                else{
                    throw new CountException("ID can only be between 1 to 50");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
