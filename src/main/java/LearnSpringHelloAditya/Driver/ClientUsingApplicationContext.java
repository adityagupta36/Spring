package LearnSpringHelloAditya.Driver;

import LearnSpringHelloAditya.Beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientUsingApplicationContext {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Object o = context.getBean("t");

        Test t = (Test)o;
        t.Hello();


    }

}
