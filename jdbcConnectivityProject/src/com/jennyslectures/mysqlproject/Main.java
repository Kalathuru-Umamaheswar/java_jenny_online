package com.jennyslectures.mysqlproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Step 1 : Load the Driver (Optional in Modern Java)
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //Step 2 : Establish Connection using DriverManager
        String url = "jdbc:mysql://localhost:3306/jdbcOnline";
        String username="root";
        String password="root";
        try(Connection connection= DriverManager.getConnection(url,username,password)){
           // System.out.println("You have successfully connected with the database");

            //Step 3 : create statement
            Statement stmt=connection.createStatement();

            //Step 4 : Execute Query
            //String query= "insert into student values(5,'Mohan',89.0,'Tirupati')";
            //String query = "delete from student where name='mohan'";
            //String query = "UPDATE STUDENT SET MARKS=45.6 WHERE NAME='RAHUL'";
            //int rollNo = 1;
            //double marks = 34.5;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the roll number of student in which you have to update the marks : ");
            int rollNo=sc.nextInt();
            System.out.println("Enter the marks : ");
            double marks=sc.nextDouble();
            String query = "update student set marks=%f where rollNo = %d".formatted(marks,rollNo);
            int rowsAffected = stmt.executeUpdate(query);
            System.out.println(rowsAffected+" row/s affected");
         /*   String query="select * from student";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()) {
//                int rollNo = rs.getInt("rollNo");
//                String name = rs.getString("name");
//                double marks = rs.getDouble("marks");
//                String city = rs.getString("city");
                int rollNo = rs.getInt(1);
                String name = rs.getString(2);
                double marks = rs.getDouble(3);
                String city = rs.getString(4);
                System.out.print(rollNo + " " + name + " " + marks + " " + city);
                System.out.println();
            } */
            stmt.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }


        //Establish connection with DataSource
    /*    MysqlDataSource ds=new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost:3306/mits");
        ds.setUser("root");
        ds.setPassword("root");
        try(Connection connection=ds.getConnection()){
            System.out.println("You have successfully connected with the database");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } */
    }
}
