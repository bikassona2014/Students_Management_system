package com.student;
import java.sql.*;
public class StudentDao {

	public  static boolean insertStudentToDB(Students st) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = ConnectionToDB.createC();
			String q = "insert into students(sname, sphone, scity) value(?,?,?)";
			// PreparedStatement  --> Dynamic
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameter
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3,st.getStudentCity());
			
			// execute...
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		
		boolean f = false;
		try {
			// jdbc code
			Connection con = ConnectionToDB.createC();
			String q = "delete from students where sid=?";
			// PreparedStatement  --> Dynamic
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameter
			pstmt.setInt(1,userId);
			
			
			// execute...
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;	
	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub

		boolean f = false;
		try {
			// jdbc code
			Connection con = ConnectionToDB.createC();
			String q = "select * from students;";
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("City : "+city);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}

	public static boolean updateStudent(int userId, Students st) {
		boolean f = false;
	    try {
	        Connection con = ConnectionToDB.createC();
	        String query = "update students set sname=?,sphone=?,scity=? where sid=?";
	        PreparedStatement pstmt = con.prepareStatement(query);
	        pstmt.setString(1, st.getStudentName());
	        pstmt.setString(2, st.getStudentPhone());
	        pstmt.setString(3, st.getStudentCity());
	        pstmt.setInt(4, userId);
	        pstmt.executeUpdate();
	        f = true;
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return f;
	}
}
