package org.student;



public class Students {
	public void getStudentInfo(int a) {
		System.out.println("student id:"+a);
	}
	public void getStudentInfo(int a,String b) {
		System.out.println("student id:"+a+"\n"+"student name:"+b);
	}
	
	public void getStudentInfo(String c,String d) {
		System.out.println("Email:"+c+"\n"+"phoneNumber:"+d);
	}
	
	public static void main(String[] args) {

		Students  o = new Students ();
		o.getStudentInfo(80);
		o.getStudentInfo(86, "Gold");;
		o.getStudentInfo("Ram@gmail.com","9994763216");
		
		
	}
}
