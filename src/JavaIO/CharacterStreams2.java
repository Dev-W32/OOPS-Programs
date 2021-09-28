package JavaIO;
import java.io.*;

public class CharacterStreams2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\CharOutput.txt");
        int i=0;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();
    }
}
