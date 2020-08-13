package systech.academy.interns;

public class HousePlan {

    public HousePlan(String location){
        System.out.println("Hey cooking food at " + location);

    }

    private int noOfBedrooms;

    private String location;

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    static {
        System.out.println("this class is loading jvm....");
    }

    {
        System.out.println("Class was initialized");
    }

}
