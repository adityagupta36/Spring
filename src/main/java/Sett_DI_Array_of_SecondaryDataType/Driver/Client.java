package Sett_DI_Array_of_SecondaryDataType.Driver;

import Sett_DI_Array_of_SecondaryDataType.Bean.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Sett_DI_Array_of_SecondaryDataType.xml");

        Object o = context.getBean("c");

        Company co = (Company) o;
        co.getCompanyDetails();


    }
}
