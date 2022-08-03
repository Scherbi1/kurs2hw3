public class Truck extends Transport implements WheelsUpdate, CheckEngine, TruckInterface,ServiceStationInterface {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    @Override
    public void updateTyre() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void check() {
        checkEngine();
        checkTrailer();
        updateTyre();
    }
}
