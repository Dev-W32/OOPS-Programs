package JavaIO;
import java.io.*;
import java.nio.Buffer;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String line;
        int count=0;
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testout.txt"));
        while ((line=br.readLine())!=null)
        {
            String words[] = line.split(" ");
            count = count+ words.length;
        }
        System.out.println("Number of words "+count);
        br.close();
    }
}
