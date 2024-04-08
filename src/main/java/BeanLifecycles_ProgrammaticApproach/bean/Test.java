package BeanLifecycles_ProgrammaticApproach.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.*;

public class Test implements InitializingBean, DisposableBean {

    private String driver, url, username, password;
    Connection con;


    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    INIT method...//Connection open
    @Override
    public void afterPropertiesSet() throws Exception {
        Class.forName(driver);
        con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Opened");
    }


    public void printSave(int id, String name, String email, String address) throws SQLException {
       /* String q = "create table studtable(tId int(20) primary key auto_increment, tName varchar(200) not null , tEmail varchar(400), tAddress varchar(400))";
        Statement st = con.createStatement();
        st.executeUpdate(q);*/
        PreparedStatement stmt = con.prepareStatement("insert into studtable values (?,?,?,?)");
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, email);
        stmt.setString(4, address);

        stmt.executeUpdate();
        System.out.println("Insertion success");


    }

    //Connection close
    @Override
    public void destroy() throws Exception {
        con.close();
        System.out.println("Connection Closed");
    }

}
