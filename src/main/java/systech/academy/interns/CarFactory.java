package systech.academy.interns;

public class CarFactory {

    public Car produceCar(String carName){

        if (carName.equalsIgnoreCase("T"))
            return new Toyota();

        else if(carName.equalsIgnoreCase("A"))
            return new Audi();

        else
            return new JapanCar();

    }
}
