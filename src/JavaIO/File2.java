package JavaIO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File2 {
    public static void main(String[] args) {
        try
        {
            FileOutputStream f2 = new FileOutputStream("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\test.txt");
            String s = "elcome to Programming";
            byte b[] = s.getBytes();
            f2.write(b);
            f2.close();
            System.out.println("Succesful");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
