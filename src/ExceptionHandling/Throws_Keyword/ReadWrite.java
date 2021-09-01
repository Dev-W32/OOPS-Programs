package ExceptionHandling.Throws_Keyword;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
// throws keyword just assigns responsibility to caller method to handle the exception
public class ReadWrite {
    void ReadFile() throws FileNotFoundException      // the method which calls this method has to handle the exception
    {
        FileInputStream fis = new FileInputStream("d:/xyz.txt");
    }
    void savFile() throws FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}
