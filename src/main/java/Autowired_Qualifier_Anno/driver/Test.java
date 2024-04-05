package Autowired_Qualifier_Anno.driver;

import Autowired_Qualifier_Anno.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("Autowired_Qualifier_Anno.xml");

        Car car = (Car)c.getBean("c");
        car.printData();

    }
}
