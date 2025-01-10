package Practice_Questions;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import org.apache.commons.io.FileUtils; 

public class Q3_QA_Demo_Practice {
	
	/* Handling forms and input fields.
	Interacting with checkboxes and radio buttons.
	Working with dynamic web tables.
	Performing drag-and-drop actions. */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[2]")).click();
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
        WebElement firstname= driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastname= driver.findElement(By.xpath("//input[@id='lastName']"));
        WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
        firstname.sendKeys("Gokulan");
        lastname.sendKeys("M");
        email.sendKeys("gokulan716@gmail.com");
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
        WebElement Ddrop= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select sd= new Select(Ddrop);
		sd.selectByVisibleText("September");
		WebElement Ydrop= driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select sy= new Select(Ydrop);
		sy.selectByValue("1998");
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, September 17th, 1998']")).click();
		WebElement checkboxes= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(checkboxes));
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		
		 }
}
