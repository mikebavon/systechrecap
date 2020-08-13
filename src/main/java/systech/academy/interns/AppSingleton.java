package systech.academy.interns;

public class AppSingleton {

    public static void main(String args []){

        CarSingleton carSingleton1 = CarSingleton.createCar();
        carSingleton1.setMsg("Message from first object...in quoates, it only get created once...");

        CarSingleton carSingleton2 = CarSingleton.createCar();

        System.out.println(carSingleton2.getMsg());

        /*CarNotSingleton  carNotSingleton1 = new CarNotSingleton();
        carNotSingleton1.setMsg("This is single message for systech interns!!");

        CarNotSingleton  carNotSingleton2 = new CarNotSingleton();
        System.out.println(carNotSingleton2.getMsg());*/


    }
}
