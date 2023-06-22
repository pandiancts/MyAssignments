package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsample {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//driver.findElement(By.id("username")).sendKeys("demosalesManager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
