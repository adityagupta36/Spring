package StereoAnn_Component.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Car {
    @Autowired
    @Qualifier(value = "e1")
    private Engine engine;


    public void printData(){
        System.out.println(engine.getEngname());
    }
}
