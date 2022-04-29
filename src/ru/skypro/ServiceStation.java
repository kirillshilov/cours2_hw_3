package ru.skypro;

public final class ServiceStation implements HaveTrailer, HaveEngine {

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.modelName);
        for (int i = 0; i < car.wheelsCount; i++) {
            car.updateTyre();
        }
        checkEngine();
    }
        public void check (Truck truck) {
                System.out.println("Обслуживаем " + truck.modelName);
        for (int i = 0; i < truck.wheelsCount; i++) {
            truck.updateTyre();
        }
            checkEngine();
            checkTrailer();

        }
        public void check (Bicycle bicycle){
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }


    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

