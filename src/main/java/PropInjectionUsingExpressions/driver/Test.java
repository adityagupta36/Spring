package PropInjectionUsingExpressions.driver;

import PropInjectionUsingExpressions.bean.ConnectionPool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext ac = new ClassPathXmlApplicationContext("PropInjectionUsingExpressions.xml");

        ConnectionPool cp = (ConnectionPool) ac.getBean("cp");
        cp.printConnection();
    }
}
