package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Checkboxes {
	
	public static void main(String []args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	  //input[@value='option1']
	    boolean status1 = driver.findElement(By.xpath("//input[@value='option1']")).isSelected();
	    boolean status3 = driver.findElement(By.xpath("//input[@value='option3']")).isSelected();
	    Thread.sleep(5000);
	    if (status1 == false) {
		    
	 	   driver.findElement(By.xpath("//input[@value='option1']")).click();
	 	   
	 		System.out.println("Option1 check box Already not checked ");
	 	   }
	 	    else {
	 	    	
	 	    	System.out.println("Already selected");
	 	    }
	    if (status3 == false) {
		    
		 	   driver.findElement(By.xpath("//input[@value='option3']")).click();
		 	  System.out.println("Option2 check box Already not checked ");
		 	   }
		 	    else {
		 	    	
		 	    	System.out.println("Already selected");
		 	    }
		}
	}
	
	
	


