package JavaIO;
import java.io.*;
import java.util.Scanner;


public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\FileOperationTest.txt");
           /* FileReader frr = new FileReader("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt");
            FileWriter fwr = new FileWriter("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\FileOperationTest.txt");
            int i;
            while ((i=frr.read())!=-1)
            {
                fwr.write(i);
                System.out.print((char)i);
            }
            fwr.write("Path of the file is D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO");
            fwr.close();
            frr.close();*/
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                String fileData = scanner.nextLine();
                System.out.println(fileData);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
