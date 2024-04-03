package SI_CI_usingP_C_namespace.driver;

import SI_CI_usingP_C_namespace.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("SI_CI_usingP_C_namespace.xml");
        Car car=(Car)c.getBean("c");
        car.printCardetails();

    }
}
