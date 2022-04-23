package Vehicles;

import Vehicles.Car;

public class CarMain {
    public static void main(String[] args) {
        Car array[] = new Car[5];

        Car car1 = new Car("c63", "Mercedes");
        Car car2 = new Car("e63", "Mercedes");
        Car car3 = new Car("s63", "Mercedes");
        Car car4 = new Car("a45", "Mercedes");
        Car car5 = new Car("gts", "Mercedes");

        array[0] = car1;
        array[1] = car2;
        array[2] = car3;
        array[3] = car4;
        array[4] = car5;

        for(Car car : array){
            car.show();
        }
        System.out.println(array[0]);

        array[2].setModel("GTR");
        array[2].show();


    }
}
