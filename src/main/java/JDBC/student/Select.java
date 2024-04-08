package JDBC.student;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="Aditya@12";
        Class.forName(driver);

        //Create a connection
        Connection c = DriverManager.getConnection(url,username,password);
        if(c.isClosed()){
            System.out.println("Connection closed");
        }
        else System.out.println("Connection Opened");

        String select = "Select * from table1";
        Statement stmt = c.createStatement();
        ResultSet r = stmt.executeQuery(select);
        while (r.next()){
            int id = r.getInt(1);
            String name = r.getString(2);
            String city = r.getString(3);

            System.out.println(id + " " + name + " " + city);

        }
    }
}
