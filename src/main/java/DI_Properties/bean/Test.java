package DI_Properties.bean;

import java.util.Properties;
import java.util.Set;

public class Test {

    private Properties driver;

    public void setDriver(Properties driver) {
        this.driver = driver;
    }

    public void printData(){
        Set s = driver.keySet();
        for (Object o : s){
            System.out.println(o +" ==> " + driver.get(o));
        }
    }
}
