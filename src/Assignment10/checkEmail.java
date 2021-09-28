package Assignment10;

import java.util.regex.*;
import java.util.Scanner;

public class checkEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your email: ");
        String email = sc.nextLine();
        sc.close();
        if (Pattern.matches("[a-zA-Z]+[\\w .]*@\\w+[.]\\w+", email)) {
            System.out.println("it is a valid email");
        } else {
            System.out.println("It is an invalid email");
        }
        System.out.print("\n");
    }
}


