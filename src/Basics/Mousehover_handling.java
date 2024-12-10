package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover_handling {

	public static void main(String[] args) {
	
		    WebDriver driver= new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    
		    WebElement mbutton = driver.findElement(By.xpath("//button[@id='mousehover']"));
		    
		   Actions act= new Actions(driver);
		   
		   act.moveToElement(mbutton).perform();
		   
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Top")));
		   
		
		  driver.findElement(By.linkText("Top")).click();
		  
		   
		 

	}

}
