package Depends_on_Atribute.driver;

import Depends_on_Atribute.beans.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("Depends_on_Atribute.xml");
        c.getBean("a");

    }
}
