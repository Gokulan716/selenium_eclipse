package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_iframes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	   WebElement framea=  driver.findElement(By.xpath("  //iframe[@name='iframe-name']"));
	    
	    driver.switchTo().frame(framea);
	    driver.findElement(By.xpath("//a[text()='Learning paths' and @class='new-navbar-highlighter']")).click();
	    
	    Thread.sleep(20000);
	    
	    driver.quit();
	    
	    System.out.println("Program Executed");
	  //iframe[@name='iframe-name']
	    
	    
	}

}
