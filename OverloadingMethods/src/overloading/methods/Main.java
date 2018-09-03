package overloading.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How angry is your dog? (0 from 10): ");
        int n = input.nextInt();

        Overloading over = new Overloading();

        over.dog();
        over.dog(n);
    }
}
