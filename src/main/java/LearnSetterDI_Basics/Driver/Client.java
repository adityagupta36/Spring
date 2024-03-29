package LearnSetterDI_Basics.Driver;

import LearnSetterDI_Basics.Bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("LearnSetterDI_Basics.xml");

        Object o = c.getBean("t");
        Test t = (Test)o;
        t.Hello("Aditya");
    }
}