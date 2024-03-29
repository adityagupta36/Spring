package Setter_DI_SecondaryDataTypes.Bean;

public class Car {
    private String carname;
    private Engine engine;

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
        System.out.println("Car constructor");
    }

    public void printData(){

        System.out.println("carname : " + carname + " Modelyear is: " + engine.getModelyear() );


    }
}
