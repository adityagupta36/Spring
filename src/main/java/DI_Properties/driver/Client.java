package DI_Properties.driver;

import DI_Properties.bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("DI_Properties.xml");
        Test t = (Test) c.getBean("c");
        t.printData();

    }
}
