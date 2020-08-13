package systech.academy.interns;

import java.util.Scanner;

public class AppFactory {

    public static void main(String args []){
        CarFactory carFactory = new CarFactory();

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the car type T,A: ");
        String carName = input.nextLine();

        Car car =  carFactory.produceCar(carName);

        car.country();


    }

}
