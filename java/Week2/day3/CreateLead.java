package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				//passing values to first name field 
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Myil");
				//passing company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//passing title values
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("JavaSelenium");
				driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])[1]")).sendKeys("Perumal");
				//create lead button click
				driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				String title = driver.getTitle();
				System.out.println(title);
				
				String actual_title=title;
				String expected_title="View Lead | opentaps CRM";
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
