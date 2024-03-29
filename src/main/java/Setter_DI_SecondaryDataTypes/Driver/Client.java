package Setter_DI_SecondaryDataTypes.Driver;

import Setter_DI_SecondaryDataTypes.Bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("Setter_DI_SecondaryDataTypes.xml");

        Car car = (Car) c.getBean("c");
        car.printData();
    }
}
