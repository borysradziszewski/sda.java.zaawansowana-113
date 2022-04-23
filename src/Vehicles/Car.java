package Vehicles;

public class Car {
    private String model;
    private String brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void show() {
        System.out.println("to jest: " + brand + " " + model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

