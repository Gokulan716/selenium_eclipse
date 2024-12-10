package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(2000);
		
		 Set<String> allWindows = driver.getWindowHandles();
		 
		 for(String window : allWindows) {
			 if(window.equals(parentwindow)) {
				driver.switchTo().window(window);
				break;
			 }
		 }
		 Thread.sleep(1000);
		 driver.quit();
	}
}
