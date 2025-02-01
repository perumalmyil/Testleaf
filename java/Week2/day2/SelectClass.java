package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
		ChromeDriver driver=new ChromeDriver();
		//Opening the Web Page
		driver.get("https://www.telerik.com/contact");
		//Maximize browser window
		driver.manage().window().maximize();
		//wait statement in java
		Thread.sleep(5000);
		//Finding Web Element for Select
		WebElement select_dp1=driver.findElement(By.id("Dropdown-1"));
		WebElement select_dp2=driver.findElement(By.id("Dropdown-2"));
		WebElement select_dp3 = driver.findElement(By.className("js-country-field"));
		//Select class for each
		Select dp1=new Select(select_dp1);
		Select dp2=new Select(select_dp2);
		Select dp3=new Select(select_dp3);
		//selecting using various methods in select class
		dp1.selectByVisibleText("General Inquiries");
		dp2.selectByIndex(10);
		dp3.selectByValue("Canada");
		
		//check after completing these above execution
		System.out.println("sucessfully executed the above selection's");
		//closing the browser
		driver.close();
	}

}
