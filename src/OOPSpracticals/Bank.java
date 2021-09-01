/*Asg1: Name of
Bank: ABC
Two Types of Customer can open account in ABC bank

1.Customer whose salary getdeposited in bank
2.Business oriented people
Two types of accounts
1.    Saving account
2.    Current account

·       Customer can open accountin bank
·       Customer can deposit money
·       Withdraw money
·       Money can be credited to the account
·       Customer can close account

Difference between Saving account and Current account

1.    Minimum balance limit for saving account is less but it is more in Current account

2.    Rate of daily transaction in current account is more than saving account( means you can set limit for daily
transaction method for saving account for one customer)*/

package OOPSpracticals;
import java.util.Scanner;

class Acc {
    void OpenAccount() {
        System.out.println("Enter the account which you want to make. Savings or Current ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reqinput1 = "savings";
        String reqinput2 = "current";
        if (input.equalsIgnoreCase(reqinput1))
        {
            System.out.println("you are opening a Savings account");
        }
        else if (input.equalsIgnoreCase(reqinput2))
        {
            System.out.println("You are opening a current account");
        }
        else System.out.println("Please enter a valid input");
    }
    void CloseAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you want to close the account?\nPress 1 to confirm your choice");
        if(sc.nextInt()==1)
        {
            System.out.println("Your account has now been closed. Thank you");
        }
    }
}
public class Bank extends Acc {
    int sal, bal = 0;

    void WithdrawMoney(int amt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select account type:\n1. Savings\n2. Current");
        int n = sc.nextInt(), noOfTransactions,i;
        switch (n)
        {
            case 1:
                noOfTransactions = 3;
                for (i = 1; i < noOfTransactions; ++i)
                {
                    bal = bal - amt;
                    System.out.println("Remaining number of transactions: " + (noOfTransactions - i));
                    System.out.println("Do you want to initiate another withdrawal?\n 1. Yes\n2. No ");
                    n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Enter the amount you want to withdraw");
                        amt = sc.nextInt();
                        if(bal>500)
                        {
                            bal = bal - amt;
                        }
                        else System.out.println("Insufficient funds");
                        System.out.println("Remaining balance " + bal);
                    } else break;
                }
                break;
            case 2:
                noOfTransactions=5;
                for (i = 0; i < noOfTransactions; ++i)
                {
                    bal = bal - amt;
                    System.out.println("Remaining number of transactions: " + (noOfTransactions - i));
                    System.out.println("Do you want to initiate another withdrawal?\n 1. Yes\n2. No ");
                    n = sc.nextInt();
                    if (n == 1) {
                        System.out.println("Enter the amount you want to withdraw");
                        amt = sc.nextInt();
                        if(bal>200 && bal>=0)
                        {
                            bal = bal - amt;
                        }
                        else System.out.println("Insufficient balance");
                        System.out.println("Remaining balance " + bal);
                    }
                    else break;
                }
        }
    }
    public void DepositMoney(int depo)
    {
        bal = bal + depo;
        System.out.println("Your current balance is "+bal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bk = new Bank();
        Acc acc = new Acc();

        System.out.println("WELCOME TO ABC BANK\n. Press 1 to continue");

        while(sc.nextInt()==1) {
            System.out.println("Enter your choice\n1. Open Account\n2. Deposit money\n3. Withdraw money\n4. Close Account");
            int n= sc.nextInt();
            switch (n) {
                case 1:
                    bk.OpenAccount();
                    System.out.println("Do you want to continue further with depositing money?? Press 1 to confirm or press any other key to exit");
                    if (sc.nextInt() == 1) {
                        // in case we want to continue to the next case
                    } else break;
                case 2:
                    System.out.println("Enter the amount of money that you want to deposit");
                    bk.DepositMoney(sc.nextInt());
                    System.out.println("Do you want to continue further with withdrawing money?? Press 1 to confirm or press any other key to exit");
                    if (sc.nextInt() == 1) {
                        // in case we want to continue to the next case
                    } else break;
                case 3:
                    System.out.println("Enter the amount of money you want to withdraw");
                    bk.WithdrawMoney(sc.nextInt());
                    System.out.println("Do you want to keep your account open or closed?? Press 1 to confirm or press any other key to exit");
                    if (sc.nextInt() == 1) {
                        System.out.println("\n");
                    } else break;

                case 4:
                    acc.CloseAccount();
                    System.out.println("Your account has been closed");
                    break;

                default:
                    System.out.println("Please try again and enter a valid value");
            }
            System.out.println("Press 1 if you want to open account again");
        }
    }
}


