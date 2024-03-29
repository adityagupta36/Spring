package LearnConstDI_Basics.Driver;

import LearnConstDI_Basics.Bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("LearnConstDI_Basics.xml");

        Object o = c.getBean("t");
        Test t = (Test)o;
        t.Hello();


        //    <-------------------------->various possibliities<------------------------>
//        t.newHello();

    }

}