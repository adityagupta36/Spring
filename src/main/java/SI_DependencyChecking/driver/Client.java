package SI_DependencyChecking.driver;

import SI_DependencyChecking.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("SI_DependencyChecking.xml");
        Car car = (Car) c.getBean("c");
        car.printData();
    }
}
