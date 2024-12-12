package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_iframes {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
