package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("pandian");
		driver.findElement(By.name("lastname")).sendKeys("Mani");
		driver.findElement(By.name("reg_email__")).sendKeys("9994763216");
		driver.findElement(By.id("password_step_input")).sendKeys("123456@!");
		WebElement op = driver.findElement(By.id("day"));
		Select option1= new Select(op);
		option1.selectByValue("3");
		//driver.close();
		WebElement op1 = driver.findElement(By.id("month"));
		Select option2= new Select(op1);
		option2.selectByValue("6");
		WebElement op2 = driver.findElement(By.id("year"));
		Select option3= new Select(op2);
		option3.selectByValue("1990");
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		radiobutton.get(0).click();
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
	}

}
