package LearnSpring.Driver;

import LearnSpring.Beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        //Find xml
        Resource r = new ClassPathResource("resources/spring.xml");

        //load xml into container
        BeanFactory bf = new XmlBeanFactory(r);

        //create Test class Object
        Object o = bf.getBean("t");
        Test test = (Test)o;
        test.Hello();
    }
}
