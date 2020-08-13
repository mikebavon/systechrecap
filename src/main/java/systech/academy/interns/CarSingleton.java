package systech.academy.interns;

public class CarSingleton {

    private CarSingleton(){}

    private static CarSingleton carSingleton;

    private static CarSingleton createCar(){
        if (carSingleton ==  null)
            carSingleton = new CarSingleton();

        return carSingleton;
    }

    public static void detais(){
        System.out.println("This is a singleton class!!!");
    }

}
