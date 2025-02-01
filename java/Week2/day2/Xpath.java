package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				//Opening the Web Page
				driver.get("https://login.salesforce.com/?locale=in");
				//Maximize browser window
				driver.manage().window().maximize();
				//wait sta1tement in java
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
				driver.findElement(By.xpath("//input[@id='Login']")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				WebElement element=driver.findElement(By.xpath("//input[@id='username']"));
				Select dd=new Select(element);
				List<WebElement> options = dd.getOptions();
				for (int i = 0; i < options.size(); i++) {
					
				}
				System.out.println("test completed");
				//closing the browser
				driver.close();
	}

}
