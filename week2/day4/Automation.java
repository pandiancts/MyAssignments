package week2.day4;

public class Automation extends MultipleLangauge {

	public void Selenium() {
		System.out.println("selenium");
	}
	
	public void Java() {
		System.out.println("java");
	}
	
	@Override
	public void ruby() {
		System.out.println("Ruby language");
		
	}
	
	
	public static void main(String[] args) {
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
		
		

	}

	

}
