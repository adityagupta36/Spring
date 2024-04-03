package DI_PrimiAndSecondary_Type_Aray.Driver;

import DI_PrimiAndSecondary_Type_Aray.Bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("DI_PrimiAndSecondary_Type_Aray.xml");
        Car car = (Car) c.getBean("c");

        car.printData();
    }
}
