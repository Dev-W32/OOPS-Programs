package JavaIO;
import java.io.File;
import java.io.FileInputStream;
// read single character from file
//Buffer is not used in byte stream
public class File3 {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt");
            int i;
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
