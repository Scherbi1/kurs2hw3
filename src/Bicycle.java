public class Bicycle extends Transport implements WheelsUpdate,ServiceStationInterface {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        updateTyre();
    }
}

