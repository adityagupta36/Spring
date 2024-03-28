package LearnSpringHelloAditya.Driver;

import LearnSpringHelloAditya.Beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientUsingBeanFactory {
    public static void main(String[] args) {
        //Find xml
        Resource r = new ClassPathResource("spring.xml");

        //load xml into container
        BeanFactory bf = new XmlBeanFactory(r);


//        create Test class Object
//        bf.getBean("t");                ==>      will create object of class Test having id="t"  //
//        To store the Object created...
//        public abstract Object getBean  ==> Object type RETURN TYPE
        Object o = bf.getBean("t");
        Object o1 = bf.getBean("t");
        Object o2 = bf.getBean("t");

        //IOC container will create only one Singleton object
        //only one object will be created (since all obj are equal)
        //scope="prototype"  ==> under spring.xml ==> multiple objects will be created or else by default it is Singleton
        System.out.println(o==o1);
        System.out.println(o1==o2);



        Test test = (Test) o;
        test.Hello();


    }

}
