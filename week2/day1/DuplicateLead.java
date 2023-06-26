package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FirstNameLocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("XPath id attribute");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kumar23@tcs.com");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println("After Create Lead - Appeared Page title - " + title );
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		WebElement companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyname.clear();
		companyname.sendKeys("Shriamfunds");
		WebElement firstname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstname.clear();
		firstname.sendKeys("Muthu");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title1 = driver.getTitle();
		System.out.println("After Duplicaet Lead Edit - Appeared Page title - " + title1 );

	}

}
