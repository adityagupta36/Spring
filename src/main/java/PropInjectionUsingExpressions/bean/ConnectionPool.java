package PropInjectionUsingExpressions.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

    private String username,url,password,driver;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void printConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        Connection c = DriverManager.getConnection(url, username, password);

        System.out.println(c);

    }
}
