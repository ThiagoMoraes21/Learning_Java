package bank.account;

import java.util.Scanner;

public class Menu {
    Account account = new Account();
    Scanner input = new Scanner(System.in);

    boolean keepGoing = true;

    public void getOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Account balance: " + account.getBalance());
                break;

            case 2:
                System.out.print("Write's the value: ");
                double depValue = input.nextDouble();
                account.deposit(depValue);
                break;

            case 3:
                System.out.print("What's the value of the Withdrawal: ");
                double withValue = input.nextDouble();
                account.withdrawal(withValue);
                break;

            case 4:
                System.out.println("Sorry, we don't have a data base yet! ");
                break;

            case 5:
                keepGoing = false;
                break;

                default:
                    System.out.println("This option do not exist!");

        }
    }
}
