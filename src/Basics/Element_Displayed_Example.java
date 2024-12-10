package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Displayed_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();	    
	    WebElement txtbox= driver.findElement(By.xpath("//input[@id='displayed-text']"));	    
	   	txtbox.sendKeys("Gokul");
	   	Thread.sleep(2000);
        System.out.println(txtbox.isDisplayed());	    
	    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	  	Thread.sleep(2000);
	    System.out.println(txtbox.isDisplayed());
	    driver.quit();

	}
}
