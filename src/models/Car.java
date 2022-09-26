package models;

public class Car extends Vehicle{
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("starting");
    }
}
