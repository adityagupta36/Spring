package SI_DI_UndefaultCollections.driver;

import SI_DI_UndefaultCollections.bean.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {


        ApplicationContext c = new ClassPathXmlApplicationContext("SI_DI_UndefaultCollections.xml");

      Test t =(Test) c.getBean("c");
      t.printData();


    }
}
