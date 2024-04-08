package JDBC.student;

import java.sql.*;
import java.util.Scanner;

public class Update {
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

        String sql = "update table1 set tName=? , tCity=? where tId=?";


        PreparedStatement ps = c.prepareStatement(sql);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter city");
        String city = sc.nextLine();
        System.out.println("enter student id");
        int student_id = sc.nextInt();


        //dynamic inputs
        ps.setString(1, name);
        ps.setString(2, city);
        ps.setInt(3, student_id);

        ps.executeUpdate();

        System.out.println("updated");
        c.close();


    }
}
