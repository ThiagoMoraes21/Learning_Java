package get.and.set;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Write the car's model: ");
        String carModel = input.next();

        Car car = new Car();
        car.setModel(carModel);
        System.out.printf("%s", car.getModel());
    }
}
