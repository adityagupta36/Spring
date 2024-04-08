package JDBC.student;

import java.sql.*;
import java.util.Scanner;

public class Insert {
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

/*        //create a query
//      CREATE a table
        String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null , tCity varchar(400))";

        //create stmt
        //static
        Statement stmt = c.createStatement();
        stmt.executeUpdate(q);*/

        String sql = "insert into table1(tName,tCity) values(?,?)";
//        Dynamic
        PreparedStatement ps = c.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter city");
        String city = sc.nextLine();


        //values set==>INSERT data
//        ps.setString(1,"Aditya Gupta" );
//        ps.setString(2, "Mumbai");

        //dynamic inputs
        ps.setString(1, name);
        ps.setString(2, city);

        ps.executeUpdate();

        System.out.println("Inserted");
        c.close();

    }
}
