package DI_Static.driver;

import DI_Static.bean.Car;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext co = new ClassPathXmlApplicationContext("DI_Static.xml");
        Car c = (Car)co.getBean("c");
        c.printCar();
    }
}
