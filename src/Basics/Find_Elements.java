package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Find_Elements {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    //by id
	    driver.findElement(By.id("autocomplete"));
	    //classname
	    driver.findElement(By.className("inputs"));
	    //Name
	    driver.findElement(By.name("dropdown-class-example"));
	    //tag name
	    
	    driver.findElement(By.tagName("a"));
	    //link text
	    driver.findElement(By.linkText("REST API"));
	    //partial link text
	    driver.findElement(By.partialLinkText("Broken"));

	 
	    
	    //--By using CSS selector--
	    
	   // By ID: input#autocomplete
	    driver.findElement(By.cssSelector("input#autocomplete"));
	    
	    //   By Class: input.inputs
	    
	    driver.findElement(By.cssSelector("a.blinkingText"));
	    
	    //    By Attribute: input[placeholder='Type to search']
	    driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']"));
	    //    By Parent-Child Relationship: div > input 
	    //driver.findElement(By.cssSelector("div > label"));
	    
	    //XpathS
	    
	    //--Absolute XPath: /html/body/div/input
	    
	    driver.findElements(By.xpath("html/body/div/fieldset/label"));
	    
	  //  Relative XPath: //input[@id='autocomplete']
	    driver.findElements(By.xpath("//input[@name='enter-name']"));
	    
	  // Contains: //input[contains(@placeholder, 'search')]
	    		
	     driver.findElements(By.xpath("//input[contains(@placeholder, 'Hide/Show')]"));
	 // Starts With: //input[starts-with(@id, 'auto')]
	    		   driver.findElements(By.xpath("//input[starts-with(@placeholder, 'Type')]"));	 
	    		 
	    //Text: //a[text()='REST API'] 
	    	
	    		   driver.findElements(By.xpath("//a[text()='VIEW ALL COURSES']"));
	    	   driver.quit();
      
	}

}
