package ru.skypro;

public class Truck extends Transport {

    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check (Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.wheelsCount; i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
    }
