package model;

public class Car extends Transport{
    public Car(String modelName) {
        super(modelName,4);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void servise() {
updateTyre();
checkEngine();
    }
}
