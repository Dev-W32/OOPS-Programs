package JavaIO;
import java.io.*;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt");
            out = new FileWriter("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\test.txt");
            int c;

            while ((c=in.read())!=-1)
            {
                System.out.println((char)c);
                out.write(c);
            }
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }

        finally {
            if(in!=null)
            {
                in.close();
            }
            if(out!=null)
            {
                out.close();
            }
        }

    }
}
