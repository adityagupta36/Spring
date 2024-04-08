package Autowired_Qualifier_Anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Car {

/*
    @Qualifier(value = "e2")   // or @Qualifier("e2") depending on which bean you want to inject
    @Autowired
    private Engine engine;
    //no need to have setters or constructor here ==> Since Autowired
*/

 /*   @Resource                     //check byName
    private Engine engine;*/

    @Inject    @Qualifier(value = "e2")           //check byName            //checkByType
    private Engine engine;


    public void printData(){
        System.out.println("Engine modelyear is : " +  engine.getModelyear());
    }

}
