package DI_Properties_FromFile.driver;

import DI_Properties_FromFile.bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("DI_Properties_FromFile.xml");
        Test t = (Test) c.getBean("p");
        t.printData();

    }
}
