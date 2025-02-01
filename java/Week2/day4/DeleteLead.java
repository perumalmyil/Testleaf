package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("perumal.myil@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//capturing the lead id on the search result page
		System.out.println(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("perumal.myil@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed())
		{
			System.out.println("suceessfully deleted the lead");
		}
		else {
			System.out.println("Lead not deleted");
		}
		driver.quit();
	}

}
