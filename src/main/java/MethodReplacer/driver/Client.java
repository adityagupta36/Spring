package MethodReplacer.driver;

import MethodReplacer.bean.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("MethodReplacer.xml");
        Bank bank=(Bank) ac.getBean("c");

        System.out.println(bank.getClass().getCanonicalName());

        bank.calInt();
        bank.deposit();
        bank.withdraw();

    }
}
