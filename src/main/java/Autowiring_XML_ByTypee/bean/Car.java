package Autowiring_XML_ByTypee.bean;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printData(){
        System.out.println("Engine Modelyear is: " + engine.getModelyear());
    }
}
