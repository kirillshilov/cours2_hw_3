package ru.skypro;

public class Car extends Transport {

    public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
    }

}