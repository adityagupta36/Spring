package JDBC.student;

import java.io.BufferedReader;
import java.sql.*;
import java.util.Scanner;

public class Delete {
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

        Scanner sc = new Scanner(System.in);
        Statement st = c.createStatement();

        while (true){
            System.out.println("enter row to be deleted");
            int deleterowno =sc.nextInt();
            //String q = "delete from table1 where tId=1";
            String q = "delete from table1 where tId=" + deleterowno;   //Concatenate
            int count = st.executeUpdate(q);
            if (count==1){
                System.out.println("delettion success");
            }
            else {
                System.out.println("Deletion failed");
            }

            System.out.println("Delete more??");
            String moredelete = sc.nextLine();
            if (moredelete.equalsIgnoreCase("no")){
                break;
            }

        }

    }
}
