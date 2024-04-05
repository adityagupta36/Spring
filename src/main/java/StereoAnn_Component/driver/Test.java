package StereoAnn_Component.driver;
import StereoAnn_Component.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("StereoAnn_Component.xml");
        Car car = c.getBean(Car.class);
        car.printData();


    }
}
