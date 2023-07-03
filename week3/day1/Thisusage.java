package week3.day1;

public class Thisusage {
	int a;
	String Name;
	public Thisusage() {
		System.out.println("default construtor");
		a=34;
		Name = "Ravi";
		System.out.println(a+" "+Name);
	}
	public Thisusage(int a,String alpha) {
	 this();
	 System.out.println("Parameterized constructor");
	 this.a=a;
	 this.Name=Name;
	 System.out.println("age is "+a+""+""+"Name:"+Name+"");
	}

public Thisusage(String college) {
	this(7,"Kongu");
	System.out.println(college);
}
	
public static void main(String[] args) {
	Thisusage s= new Thisusage("asan college");
	
}

}
