package ExceptionHandling;
import java.io.IOException;
//Exception Propagation
// Throw with checked Expression. It is mandatory to use throw with checked expression
// Checked expressions are checked at compile time
//throw is used inside method to display classname stacktrace etc etc


/*class DeviceException extends IOException{       // No need of writing this shit
    DeviceException(String str)
    {
        super(str);
    }
}*/

public class Test1CheckedEx  {

    void m() throws IOException
    {
        // Coantains Exception
        throw new IOException("Device error");
    }

    void n() throws IOException
    {
        m();
    }
    void p() throws IOException
    {
        n();
    }

    public static void main(String[] args) {
        Test1CheckedEx e = new Test1CheckedEx();
        try {
            e.p();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
        System.out.println("Rest of the code");
    }
}
