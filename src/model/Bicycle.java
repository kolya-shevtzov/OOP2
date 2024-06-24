package model;

public class Bicycle extends Transport{
    public Bicycle(String modelName) {
        super(modelName,2);
    }
        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }

    @Override
    public void servise() {
updateTyre();
    }
}

