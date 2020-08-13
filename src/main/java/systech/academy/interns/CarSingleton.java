package systech.academy.interns;

public class CarSingleton {

    private CarSingleton(){}

    private static CarSingleton carSingleton;

    private String msg;

    public static CarSingleton createCar(){
        if (carSingleton ==  null)
            carSingleton = new CarSingleton();

        return carSingleton;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
