package ru.skypro;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2",4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);
        car.check(car);
        truck.check(truck);
        bicycle.check(bicycle);
    }
}