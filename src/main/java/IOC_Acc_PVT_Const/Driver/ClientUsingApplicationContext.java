package IOC_Acc_PVT_Const.Driver;

import IOC_Acc_PVT_Const.Beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientUsingApplicationContext {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringIOC_Acc_PVT_Cont.xml");

        Object o = context.getBean("t");

        Test t = (Test)o;
//        Car t = (Car)context.getBean("t");

        t.Hello();


    }

}
