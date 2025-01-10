package Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Take_screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		 try {
	            // Navigate to the webpage
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	            // Use JavaScriptExecutor to scroll to the bottom of the page
	            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	            // Pause for a moment to ensure the page has loaded completely
	            Thread.sleep(2000); 

	            // Take a screenshot of the entire page
	            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	            // Save the screenshot to a specific location
	            File destinationFile = new File("normalScreenshot.png");
	            Files.copy(screenshotFile.toPath(), destinationFile.toPath());

	            System.out.println("Screenshot saved at: " + destinationFile.getAbsolutePath());
	        } catch (IOException | InterruptedException e) {
	            System.out.println("Error taking screenshot: " + e.getMessage());
	        } finally {
	            // Quit the driver
	            driver.quit();
	        }

		 
	}

}
