package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_values_handling {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    
	    //WebElement tablename =driver.findElement(By.id("product"));
	 
	    List<WebElement> tablerows= driver.findElements(By.tagName("tr"));
	    
	     int columnIndex= 3;
	     
	     for (int i=1; i<tablerows.size(); i++) {
	    	List<WebElement> cell= tablerows.get(i).findElements(By.tagName("td"));
	    	 if(columnIndex<cell.size())
	    	 {	    	 String amount = cell.get(columnIndex).getText();
	    	 
	    	 System.out.println(amount);
	    	 }
	    	 
	     }
	}

}
