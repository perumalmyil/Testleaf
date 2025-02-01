package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Opening the Web Page
		driver.get("https://en-gb.facebook.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		//creating a account 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("jeftest");
		driver.findElement(By.name("lastname")).sendKeys("lead");
		WebElement Date_drp = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement Month_drp = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement Year_drp = driver.findElement(By.xpath("//*[@id='year']"));
		Select Date=new Select(Date_drp);
		Select Month=new Select(Month_drp);
		Select Year=new Select(Year_drp);
		Date.selectByValue("20");
		Month.selectByValue("6");
		Year.selectByValue("1996");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("jeftest324@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Newpasskey0123,");
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();
		Thread.sleep(5000);
		System.out.println("test executed successfully");
		driver.quit();
	}

}
