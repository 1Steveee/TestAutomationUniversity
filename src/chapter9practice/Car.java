package chapter9practice;

public class Car {

    private String color;
    private String make;
    private String model;
    private int yearMade;

    public Car(String color, String make, String model, int yearMade) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.yearMade = yearMade;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

}
