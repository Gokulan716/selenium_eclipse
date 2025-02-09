package Practice_Questions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_java {

	public static void main(String[] args) {

		
		

		  WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
		 
		
		    WebElement search = driver.findElement(By.xpath("//textarea[@title='Search']"));
		    search.click();
		    search.sendKeys("Java"+Keys.ENTER);
		   
		
		   ((JavascriptExecutor) driver).executeScript("window.open();");

	   
	        for (String tab : driver.getWindowHandles()) {
	            driver.switchTo().window(tab);
	        }
	    	driver.get("https://www.google.com/");
	    	WebElement search2 = driver.findElement(By.xpath("//textarea[@title='Search']"));
	    	search2.click();
			search2.sendKeys("Selenium"+Keys.ENTER);
			
			

	}
}

// goto google java 
// new tab then selenium
