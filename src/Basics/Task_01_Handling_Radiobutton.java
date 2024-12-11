package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_01_Handling_Radiobutton {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    boolean status = driver.findElement(By.xpath("//input[@value='radio3']")).isSelected();   
	    System.out.println(status);
	    Thread.sleep(5000);
	    if (status == false) {
	    
	   driver.findElement(By.xpath("//input[@value='radio3']")).click();
	   }
	    else {
	    	
	    	System.out.println("Already selected one");
	    }

	}

}
