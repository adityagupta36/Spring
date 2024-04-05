package Autowiring_XML_Constructor.bean;

public class Car {
    private Engine engine;


    public Car(Engine engine){
        this.engine=engine;
    }

    public void printData(){
        System.out.println("engine model year is: " + engine.getModelyear());
    }
}
