package Autowired_Qualifier_Anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

    @Qualifier(value = "e2")   // or @Qualifier("e2") depending on which bean you want to inject
    @Autowired
    private Engine engine;
    //no need to have setters or constructore here ==> Since Autowired


    public void printData(){
        System.out.println("Engine modelyear is : " +  engine.getModelyear());
    }

}
