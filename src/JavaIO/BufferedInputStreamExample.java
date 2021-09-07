package JavaIO;
import java.io.*;
public class BufferedInputStreamExample{
    public static void main(String[] args){
        try{
            FileInputStream fin=new FileInputStream("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testBuffOut.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
