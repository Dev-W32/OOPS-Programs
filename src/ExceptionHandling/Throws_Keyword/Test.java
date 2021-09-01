package ExceptionHandling.Throws_Keyword;
// throws keyword is preferably used to handle checked exception
// throw is preferably used for custom exceptions
import java.io.FileNotFoundException;
public class Test {
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            ReadWrite rw = new ReadWrite();
            rw.ReadFile();
        }
        catch (FileNotFoundException e )
        {
            e.printStackTrace();
        }
        try
        {
            ReadWrite sf = new ReadWrite();
            sf.savFile();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("File saved");
    }
}
