package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(1000);
		driver.close();

	}

}
