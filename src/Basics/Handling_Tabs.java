package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String parenttab =driver.getTitle();
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		Set<String> allTabs = driver.getWindowHandles();
		Thread.sleep(2000);
		
		for(String tab:allTabs) {
			if(!tab.equals(parenttab)) {
			   driver.switchTo().window(tab);
			   break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
