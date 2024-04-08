package BeanLifecycles_ProgrammaticApproach.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import BeanLifecycles_ProgrammaticApproach.bean.Test;

import java.sql.SQLException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("BeanLifecycles_ProgrammaticApproach.xml");
        Test t = (Test) cac.getBean("t");
        Scanner sc = new Scanner(System.in);


        //Loop statements are executed all the time
        while (true){

            System.out.println("enter 1 for save operation and 2 for close");
            int i = sc.nextInt();

            switch (i) {

                case 1:
                    System.out.println("enter id");
                    int id = sc.nextInt();
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter email");
                    String email = sc.next();
                    System.out.println("address");
                    String address = sc.next();

                    t.printSave(id, name, email, address);

                    break;

                default: cac.close();
                    break;
            }

        }

    }
}

