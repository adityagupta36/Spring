package StereoAnn_Component.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.PropertyPlaceholderHelper;

import javax.inject.Named;


//@
@Named
public class  Car {
    @Autowired
    @Qualifier(value = "e2")
    private Engine engine;


    public void printData(){
        System.out.println(engine.getEngname());
    }
}
