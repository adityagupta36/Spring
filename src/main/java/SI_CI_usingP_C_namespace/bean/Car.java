package SI_CI_usingP_C_namespace.bean;
import SI_CI_usingP_C_namespace.bean.Engine;

public class Car {


    private String carname;

    private Engine engine;

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void printCardetails(){
        System.out.println("car name is: " + carname + " and model year is " + engine);

    }
}
