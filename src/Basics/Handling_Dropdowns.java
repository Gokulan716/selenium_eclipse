package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sdrop= new Select(dropdown);
		
		//Select by Visible text.
		
		sdrop.selectByVisibleText("Option1");
		Thread.sleep(2000);

		//Select by Value.
		sdrop.selectByValue("option2");
		Thread.sleep(2000);
		
		//Select by id.
		sdrop.selectByIndex(3);
		Thread.sleep(2000);
		

		
		List<WebElement> sdropvalues =sdrop.getOptions();
		//Finding size of dropdown
		System.out.println(sdropvalues.size());
		
		//Printing all the values from dropdown
		
		for(WebElement sd: sdropvalues) {
			System.out.println(sd.getText());
		}
		
		
		driver.quit();
    
	}

}
