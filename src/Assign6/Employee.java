package Assign6;

public class Employee {
    int employeeID;
    String employeeName;
    Employee(String employeeName, int employeeID) {
        System.out.println("Employee's Name: "+employeeName);
        System.out.println("Employee's ID: "+employeeID);
    }
}

interface Taxable {
    void calculateTax();
}

class HourlyEmployee extends Employee {
    int ratePerHour;
    int hoursWorked;

    HourlyEmployee(String employeeName, int employeeID) {
        super(employeeName, employeeID);
    }

    void calculatePartTimeSalary() {
        int partTimeSalary;
        ratePerHour = 54;
        System.out.println("Rate per hour: "+ratePerHour);
        hoursWorked = 7;
        System.out.println("No. of hours worked: "+hoursWorked);
        partTimeSalary = ratePerHour * hoursWorked;
        System.out.println("THe part time salary of the employee is: "+partTimeSalary + "\n");
    }
}

class Permanent extends Employee implements Taxable {
    long Salary;
    int extraEarnings;

    Permanent(String employeeName, int employeeID) {
        super(employeeName, employeeID);
    }

    void additionalEarning() {
        Salary = 150000;
        System.out.println("Base Salary of the employee: "+Salary);
        extraEarnings = 30000;
        System.out.println("Additional earnings of the employee: "+extraEarnings);
        /* System.out.println("The additional earnings of the permanent employee is: "+extraEarnings);*/
    }

    public void calculateTax() {
        int totalSalary = (int) (Salary + extraEarnings);
        System.out.println("The total salary of the permanent employee is: "+totalSalary);

        if (totalSalary>100_000 && totalSalary<500_000) {
            double tax1 = 0.1 * totalSalary;
            System.out.println("The tax applicable is: "+tax1);
        }

        if (totalSalary>500_000) {
            double tax2 = 0.2 * totalSalary;
            System.out.println("The tax applicable is: "+tax2);
        }
    }
}

class Main {
    public static void main(String[] args) {
        HourlyEmployee hemp = new HourlyEmployee("Miachael Scofield", 1111);
        hemp.calculatePartTimeSalary();

        Permanent pemp = new Permanent("Sarah Tancredi", 1110);
        pemp.additionalEarning();
        pemp.calculateTax();
    }
}