package Setter_DI_SecondaryDataTypes.Bean;

public class Engine {
    private String modelyear;




    public String getModelyear() {
        return modelyear;
    }

    public Engine() {
        System.out.println("Engine constructor");
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }
}

