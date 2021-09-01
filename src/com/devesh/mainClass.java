package com.devesh;

class Contact {
    String contactPerson = "Devesh",email,companyName="Google";
    int mobile;
    Contact()
    {
       // Default Constructor
    }
    Contact(int mobile,String email)
    {
        this.mobile=mobile;
        this.email=email;
    }

    void printContact(int mobile,String email)
    {

        System.out.println("The person "+ contactPerson+" can be contacted through mobile or email "+"\nmobile Number of the person is: "+mobile+"\nEmail of the person is: "+email);
    }
}
class CompanyContact extends Contact
{
    String companyName,dept="Engineering and technology",city,country,address;
    final String website="www.google.com";
    int pin=440014;
    CompanyContact(String city)
    {
        this.companyName="Google";
        this.address=" IT Park";
        System.out.println("Company that  "+super.contactPerson+" of "+this.dept+" department works with is: "+companyName+"\nLocated in "+city);
        System.out.println("The company website is "+website+" and their address is "+address+" "+this.pin);
    }
}
class  EmployeeContact extends Contact {
    String city, country, designation = "Software engineer";
    int pin, DOB;

    EmployeeContact(int mobile, String email) {
        super(mobile, email);
    }

    void printContact(String city,String country) {
        System.out.println(super.companyName + " is located in" + city + " ," + country);
        System.out.println("Where " + super.contactPerson + " works as a " + designation);
    }

}
public class mainClass{
    public static void main(String[] args) {
        Contact c0 = new Contact();
        Contact c1 = new Contact(772087425,"devesh.wadhwani123@gmail.com");
        CompanyContact c2 = new CompanyContact("Nagpur");
        EmployeeContact c3 = new EmployeeContact(772087425,"devesh.wadhwani123@gmail.com");
        c1.printContact(77208742,"devesh.wadhwani123@gmail.com");
        c3.printContact(" Nagpur","India");
    }

}



