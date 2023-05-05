package com.student;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDB {

	 static Connection con;
	
     public static Connection createC() {
	   try {
		 // Load the driver 
		 //Class.forName("com.mysql.jdbc.Driver");
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 // create connection
		 String user ="root";
		 String password ="Bikas@123";
		 String url = "jdbc:mysql://localhost:3306/student_manage";
		 
		 con = DriverManager.getConnection(url, user, password);
		 
		 
		 
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
	return con;
	
 }
}
