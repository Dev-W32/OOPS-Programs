package JavaIO;

import java.io.*;
public class BufferedOutputStreamExample{
    public static void main(String[] args)throws Exception {
        File obj = new File("D:\\Java Tutorial\\OOPS_Practicals\\src\\JavaIO\\testBuffInOut.txt");

        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(obj));
        String s = "Testing it";
        byte[] b = s.getBytes();
        int i;
        for( i=0;i<b.length;i++) {
            bout.write(b[i]);
        }
        bout.flush();
        bout.close();
        FileInputStream fin = new FileInputStream(obj);
        BufferedInputStream bin = new BufferedInputStream(fin);
        while ((i=fin.read())!=-1 ) {
            System.out.print((char)i);
        }
        fin.close();
        bin.close();

    }
}