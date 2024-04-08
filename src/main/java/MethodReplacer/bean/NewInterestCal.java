package MethodReplacer.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewInterestCal implements MethodReplacer {


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("New cal interest calculated in new implementation method");
        return null;
    }
}
