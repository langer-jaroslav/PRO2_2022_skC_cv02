package models;

public abstract class Vehicle {
    private String brand;
    protected Vehicle(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public abstract void start();
}
