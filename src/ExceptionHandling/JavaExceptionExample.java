package ExceptionHandling;

public class JavaExceptionExample{
    public static void main(String[] args){
        int i=4,j=0,q;
        try{
            //code that may raise exception
            q=i/j;
            System.out.println(q);

        }
        catch(Exception e)
        {
            System.out.println(e+"\nCant be devided by 0");
            System.out.println(i/(j+2));        // handling exception inside catch block
        }
        finally {
            //rest code of the program
            System.out.println("rest of the code...");
        }

    }
}