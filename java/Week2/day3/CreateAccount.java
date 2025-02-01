package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Opening the Web Page
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize browser window
				driver.manage().window().maximize();
				//passing values for login credentials
				driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				//click on CRM/SFA link button
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				//passing values to account name field 
				driver.findElement(By.xpath("(//input[@id='accountName'])")).sendKeys("Myiltest");
				//passing Description
				driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium Automation Tester");
				//passing Number of employees
				driver.findElement(By.id("numberEmployees")).sendKeys("5");
				//passing site name as LeafTaps
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				//create account button click
				driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				String title = driver.getTitle();
				System.out.println(title);
				
				String actual_title=title;
				String expected_title="Create Account | opentaps CRM";
				if(actual_title.equals(expected_title))
				{
					System.out.println("test passed");
				}
				else {
					System.out.println("case failed :  title is not same to verify");
				}
				
				
				driver.quit();
	}

}
