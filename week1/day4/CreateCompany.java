package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCompany {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Samsung");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramkumar");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Antony");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pandian43@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994763216");
		Thread.sleep(1000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
