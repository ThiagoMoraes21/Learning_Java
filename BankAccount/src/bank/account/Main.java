package bank.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Menu menu = new Menu();

		System.out.print("WELCOME TO THE WORST BANK EVER!");

    	while (menu.keepGoing) {
			System.out.println("\n");
			System.out.println("CHOOSE THE NUMBER'S OPTION");
			System.out.println("\t1 - See the balance\n\t2 - Make a deposit\n\t3 - To make a Withdrawal");
			System.out.println("\t4 - Make a new Account\n\t5 - Exit");
			System.out.print("Number option: ");

			Scanner input = new Scanner(System.in);
			int option = input.nextInt();

			menu.getOption(option);
		}

    }
}
