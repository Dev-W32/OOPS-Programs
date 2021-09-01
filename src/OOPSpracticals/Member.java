public class Member{

    String Name,Address;
    int Age,PhoneNo;
    double Salary;
    public void PrintSalary(){
    }
}
class Employee extends Member{
    String spec,depart;
}
class Manager extends Member{
    String spec,depart;
}
 class MemberMain {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        m1.PrintSalary();
        e1.PrintSalary();
        m1.Name="John";
        m1.Address="17 street London";
        m1.Age = 24;
        m1.PhoneNo = 1234567890;
        m1.Salary=100000.0;
        m1.spec = "AI";
        m1.depart = "CS";
        e1.Name = "James";
        e1.Address = "19 street London";
        e1.Age=22;
        e1.PhoneNo= 264859173;
        e1.Salary=60000;
        e1.spec="Big Data";
        e1.depart="CS";
        System.out.println("Information about Employee:\nName: "+e1.Name+"\nAd dress: "+e1.Address+"\nAge: "+e1.Age+"\nPhone no.: "+e1.PhoneNo+"\nSalary: "+e1.Salary+"\nSpecialization :"+e1.spec+"\nDepartement: "+e1.depart);
        System.out.println("\n------------------------------------------------------------\n");
                System.out.println("Information about Manager:\nName: "+m1.Name+"\nAdd ress: "+m1.Address+"\nAge: "+m1.Age+"\nPhone no.: "+m1.PhoneNo+"\nSalary: "+m1.Salary+"\nSpecialization :"+m1.spec+"\nDepartement: "+m1.depart);
        System.out.println("\n------------------------------------------------------------\n");
    }

}