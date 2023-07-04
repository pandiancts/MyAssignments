package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Pandian");
		prompt.accept();
		
		WebElement source = driver.findElement(By.xpath("//p[@id='demo']"));
		String fromSource = source.getText();
		
		if(fromSource.contains("Pandian"))
			System.out.println("Yes! the source contains your name---" + fromSource);
		else
			System.out.println("No the source is not having your name");
        
      }
}


