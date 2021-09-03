package JavaIO;
import java.io.File;
import java.io.FileInputStream;
// read single character from file
public class File3 {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\test.txt");
            int i = 0;
            while ((i=f1.read())!=-1)
            {
                System.out.print((char) i);
            }

            f1.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
