package Assignment12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortByID implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        return o1.empid - o2.empid;
    }
}


public class Employee {
    String name, type;
    int empid;
    int perks;

    public Employee(String name, int empid, String type) {
        this.name = name;
        this.empid = empid;
        this.type = type;
    }


    int PerksAssigner() {
        if (this.type.equalsIgnoreCase("permanent")) {
            perks = 5000;

        }
        if (this.type.equalsIgnoreCase("adhoc")) {
            perks = 1000;

        }
        return perks;
    }


    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(new File("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\newemp.txt"));
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("Ted", 75, "permanent"));
        emplist.add(new Employee("Robin", 35, "adhoc"));
        emplist.add(new Employee("Marshal", 72, "permanent"));
        emplist.add(new Employee("Barney", 38, "adhoc"));
        emplist.add(new Employee("Lily", 30, "permanent"));
        Collections.sort(emplist, new sortByID());
        System.out.println("Name  " + "ID  " + "Type\n");
        for (Employee empl : emplist) {
            System.out.println(empl.name + "  " + empl.empid + " " + empl.type);
            System.out.println("Perks: " + empl.PerksAssigner() + "\n");
            fw.write(empl.name + "  " + empl.empid + " " + empl.type + "\n Perks: " + empl.PerksAssigner() + "\n\n");
        }
        System.out.println("Following data displayed has been successfully written in a file");
        fw.close();


    }

}
