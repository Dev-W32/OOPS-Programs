package JavaIO;
import java.io.*;

public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt");
            out = new FileWriter("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\CharOutput.txt");
            int i=0;
            while ((i=in.read())!=-1)
            {
                System.out.print((char)i);
                out.write(i);
            }
        }
        finally {
            if(in != null)
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
