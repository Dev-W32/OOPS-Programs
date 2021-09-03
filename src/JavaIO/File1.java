package JavaIO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File1 {
    public static void main(String[] args)
    {
        try {
            FileOutputStream f1 = new FileOutputStream("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt");  // File will be created
            f1.write(65);
            f1.close();
            System.out.println("Successful");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
