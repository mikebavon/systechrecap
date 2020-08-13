package systech.academy.interns;

import java.math.BigDecimal;

public abstract class Car implements CarDetails{

    private String model;

    private String color;

    private BigDecimal price;

    public void country(){
        System.out.println("Country of origin is unknown....");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFuelType(){
        return "Petrol or Diesel";
    }
}
