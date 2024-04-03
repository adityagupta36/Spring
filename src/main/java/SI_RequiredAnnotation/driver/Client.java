package SI_RequiredAnnotation.driver;

import SI_RequiredAnnotation.bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws Exception {

        ApplicationContext c = new ClassPathXmlApplicationContext("SI_RequiredAnnotation.xml");
        Test t = (Test)c.getBean("t");
        t.printCon();
    }
}
