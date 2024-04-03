package SI_RequiredAnnotation.bean;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    String driver;
    String url;
    String username;
    String password;
    String checkReqAnnot;

    @Required
    public void setDriver(String driver) {
        this.driver = driver;
    }
    @Required
    public void setUrl(String url) {
        this.url = url;
    }
    @Required
    public void setUsername(String username) {
        this.username = username;
    }
    @Required
    public void setPassword(String password) {
        this.password = password;
    }

    @Required
    public void setCheckReqAnnot(String checkReqAnnot) {
        this.checkReqAnnot = checkReqAnnot;
    }

    public void printCon() throws Exception  {
//    Load the JDBC driver
    Class.forName(driver);

//    Establish the connection
    Connection c = DriverManager.getConnection(url, username, password);
        System.out.println(c);
        System.out.println(checkReqAnnot);
}

}
