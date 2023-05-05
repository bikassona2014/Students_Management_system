package com.student;

public class Students {
private int studentId;
private String studentName;
private String studentPhone;
private String studentCity;


public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentPhone() {
	return studentPhone;
}

public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}

public String getStudentCity() {
	return studentCity;
}

public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}

public Students(int studentId, String studentName, String studentPhone, String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentPhone = studentPhone;
	this.studentCity = studentCity;
}

public Students(String studentName, String studentPhone, String studentCity) {
	super();
	this.studentName = studentName;
	this.studentPhone = studentPhone;
	this.studentCity = studentCity;
}

public Students() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
			+ ", studentCity=" + studentCity + "]";
}



}
