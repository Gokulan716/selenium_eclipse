package Practice_Questions;

import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1_Handling_DropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement ddown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select sdrop= new Select(ddown);
		
		Thread.sleep(2000);
		sdrop.selectByVisibleText("Option1");
		
		sdrop.selectByValue("option2");
		
		Thread.sleep(2000);
		
	
		sdrop.selectByIndex(0);
		
		List<WebElement> dropval= sdrop.getOptions();
		
		System.out.println(dropval.size());
		
		for(WebElement values: dropval) {
			System.out.println(values.getText());
			
		}
		
		driver.quit();
		
	}

}
