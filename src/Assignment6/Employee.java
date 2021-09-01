package Assignment6;
class Employee{
    String id="TEM",name="Ted Mosby";
    double tax;
}
interface taxable{
   void calculatetax();
}
class permanent extends Employee implements taxable{
    double salary=250000,Additional=12233,total;
   public void calculatetax()
    {
        total=salary+Additional;
        if(total>=100000 && total<=500000)
        {
            tax=0.1*total;
            System.out.println("Tax is 10% which amounts to "+tax);
        }
        else if(total>500000)
        {
            tax=0.2*total;
            System.out.println("Tax is 20% which amounts to "+tax);
        }
        else {
            System.out.println("Not applicable");
        }
    }
}

class HourlyEmployee extends Employee{
    float hoursWorked=5,ratePerHour=3000;
    void calculateSalary(String name,String id)
    {
        float salary=hoursWorked*ratePerHour;
        System.out.println("Name: "+name+"\n"+"ID: "+id+"\nToday's salary is "+salary);
    }
}

class mainClass{
    public static void main(String[] args) {
        permanent per = new permanent();
        System.out.println("Name: "+per.name+"\n"+"ID: "+per.id+"\nSalary "+per.salary+"\nAdditional Earnings "+per.Additional);
        per.calculatetax();
        HourlyEmployee hrly = new HourlyEmployee();
        System.out.println("\nFor hourly employee");
        hrly.calculateSalary("Tracy Mosby","TM");
    }
}


