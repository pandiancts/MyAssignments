package org.student;

import org.department.Department;


public class Student extends Department{

	public void studentName() {
		System.out.println("Thangapandian");
	}
	
	public void studentDept() {
		System.out.println("Computer Science");
	}
	
	public void studentId() {
		System.out.println("SC90037");
	}
	public static void main(String[] args) {
		Student c = new Student();
		
		c.studentName();
		c.studentDept();
		c.studentId();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.deptName();

	}

}
