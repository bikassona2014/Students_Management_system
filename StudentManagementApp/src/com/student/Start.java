package com.student;
import java.util.*;
import java.io.*;
public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
    System.out.println("Welcome to Student Management App");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
    	System.out.println("Press 1 for Add Students");
    	System.out.println("Press 2 for Delete Students");
    	System.out.println("Press 3 for Display Students");
    	System.out.println("Press 4 for Update Student");
    	System.out.println("Press 5 for Exit");
    	
    	int c = Integer.parseInt(br.readLine());
    	
    	if(c==1) {
    		// add student code;
    	System.out.println("Enter User Name: ");
    	String name = br.readLine();
    	
    	System.out.println("Enter Phone Number: ");
    	String phone = br.readLine();
    	
    	System.out.println("Enter City Name: ");
    	String city = br.readLine();
    	
    	Students st = new Students(name,phone,city);
        boolean answer = StudentDao.insertStudentToDB(st);
        if(answer) {
        	System.out.println("Student is added successfully....");
        } else {
        	System.out.println("Somthing is wrong");
        }
    	System.out.println(st);
    	
    	}
    	else if(c==2) {
    		// delete student code;
    		System.out.println("Enter student id to delete: ");
    		int userId = Integer.parseInt(br.readLine());
    		boolean f =StudentDao.deleteStudent(userId);
    		if(f) {
    			System.out.println("Deleted......");
    		} else {
    			System.out.println("Something went wrong.......");
    		}
    	}
    	else if(c==3) {
    		// display student code;
    		StudentDao.showAllStudent();
    	}
    	
    	else if (c == 4) {
    	    // update student code
    	    System.out.println("Enter student id to update: ");
    	    int userId = Integer.parseInt(br.readLine());

    	    System.out.println("Enter new name: ");
    	    String name = br.readLine();

    	    System.out.println("Enter new phone number: ");
    	    String phone = br.readLine();

    	    System.out.println("Enter new city name: ");
    	    String city = br.readLine();

    	    Students st = new Students(name, phone, city);
    	    boolean f = StudentDao.updateStudent(userId, st);
    	    if (f) {
    	        System.out.println("Updated......");
    	    } else {
    	        System.out.println("Something went wrong.......");
    	    }
    	}
    	
    	
    	else if(c==5) {
    		//exit
    		break;
    	}
    	else {
    		
    	}
    }
    System.out.println("Thank you for using my application");
	}

}
