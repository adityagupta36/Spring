package IOC_Acc_PVT_Const.Driver;

import IOC_Acc_PVT_Const.Beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientUsingBeanFactory {
    public static void main(String[] args) {

        Resource r = new ClassPathResource("SpringIOC_Acc_PVT_Cont.xml");


        BeanFactory bf = new XmlBeanFactory(r);


        Object o = bf.getBean("t");

        Test test = (Test) o;
        test.Hello();


    }

}
