// Throw keyword is always used for unchecked exception
// Example for throws with user Defined Exception
package ExceptionHandling;
class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String str)
    {
        super(str);
    }
}
public class Voting {
    public static void main(String[] args) {
        int age=14;
        try{
        if(age<18)
        {
            throw new YoungerAgeException("Age is less than 18");
         // System.out.println("Hello World");    // Unreachable statement error
        }
        else {
            System.out.println("Eligible for voting");
        }
        System.out.println("Rest of the code");   // If age<18 Wont print as we havent handled exception
    }
    catch (YoungerAgeException e)
    {
        e.printStackTrace();
    }
        finally {
            System.out.println("Rest of the code from finally block");
        }
        System.out.println("Rest of the code");
    }

}
