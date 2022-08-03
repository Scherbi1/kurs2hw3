public class Bicycle  {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    /*  Bicycle bicycle = new Bicycle();
    Bicycle bicycle2 = new Bicycle();
    bicycle.modelName = "bicycle1";
    bicycle2.modelName = "bicycle2";
    bicycle.wheelsCount = 2;
    bicycle2.wheelsCount = 2;*/


}

