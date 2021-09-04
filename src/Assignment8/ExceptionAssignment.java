package Assignment8;

import java.util.Scanner;

class Employee extends Exception {

    String name, id, departname;
    int idnum;

    void getdata(String name, String id ) throws Exception {
        // CS001 to CS050
        this.name=name;
        this.id=id;
        idnum=Integer.parseInt(id.substring(3,5));
        departname=id.substring(0,2);
        if(departname.equalsIgnoreCase("CS") || departname.equalsIgnoreCase("IT") || departname.equalsIgnoreCase("EC")){
        if (idnum >= 1 && idnum <= 50) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
        else {
            throw new Exception("ID cannot be less than 1 or greater than 50");
        }
        }
        else throw new Exception("Department does not match");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();

        try {
            em.getdata(sc.next(),sc.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
