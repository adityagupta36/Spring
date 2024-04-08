package LookupMethod_DI.driver;

import LookupMethod_DI.bean.Car;
import LookupMethod_DI.bean.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("LookupMethod_DI.xml");

        Car car = (Car)ac.getBean("c");
        Engine eng  = car.myEngine();
        eng.print();
    }
}
