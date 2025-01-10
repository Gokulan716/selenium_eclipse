package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gokul");
		    
		    //Simple alert pop-up
		   driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		   Alert popup=driver.switchTo().alert();
		  System.out.println(popup.getText());
		  Thread.sleep(1000);
		   popup.accept();
		   
		   //confirmation alert pop-up
		   //accept
		   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gokul");
		   driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		   Alert popup1=driver.switchTo().alert();
		   Thread.sleep(2000);
		  System.out.println(popup.getText());
		   popup1.accept();
		   //dismiss
		   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gokul");
		   driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		   Thread.sleep(2000);
		   Alert popup2=driver.switchTo().alert();
		   Thread.sleep(2000);
		   popup2.dismiss();
		   driver.quit();
		   
		   
		   

	}

}
