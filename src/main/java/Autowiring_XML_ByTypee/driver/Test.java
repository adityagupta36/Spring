package Autowiring_XML_ByTypee.driver;

import Autowiring_XML_ByTypee.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


        ApplicationContext c = new ClassPathXmlApplicationContext("Autowiring_XML_ByType.xml");
        Car car = (Car) c.getBean("c");
        car.printData();
    }
}
