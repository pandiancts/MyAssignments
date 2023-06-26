package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpractise {

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
		WebElement op = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select option1= new Select(op);
		option1.selectByValue("IND_SOFTWARE");
		WebElement op1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option2= new Select(op1);
		option2.selectByValue("OWN_PROPRIETOR");
		Thread.sleep(1000);
		WebElement op2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option3= new Select(op2);
		option3.selectByValue("USA-84057");
		
		
		
		
		
	}

}
