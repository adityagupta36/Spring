package Setter_DI_ArraydataType.Driver;

import Setter_DI_ArraydataType.Bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("Setter_DI_ArraydataType.xml");

        Car car = (Car) c.getBean("c");
        car.printData();
    }
}
