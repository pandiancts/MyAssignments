package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listtest {
	
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/"); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    
   List <WebElement> links = driver.findElements(By.tagName("a"));
   int size = links.size();
   System.out.println("total no of links:"+size);
    
    
    //System.out.println(links);
    
    for (int i = 0; i < size; i++) 
    {
    	String text = links.get(i).getText();
    	System.out.println(text);
    }
    driver.close();
    
}
}

