package ru.skypro;

public class Bicycle extends Transport {



    public Bicycle(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
    }
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.wheelsCount; i++) {
            updateTyre();
        }
    }
}