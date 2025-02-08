package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
				driver.findElement(By.linkText("Create Lead")).click();
				//passing values to first name field 
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Myil");
				//passing company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AMZ");
				//passing Last name field values 
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Perumal");
				driver.findElement(By.name("lastNameLocal")).sendKeys("testmyil");
				//passing Department field
				driver.findElement(By.name("departmentName")).sendKeys("QA_Testing");
				//Description field
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Description_sample");
				//Select the state
				WebElement state_element = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select state=new Select(state_element);
				state.selectByValue("TX");
				//passing mail id field
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("perumal.myil@gmail.com");
				//create lead button click
				driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				System.out.println("creaded Lead, Now click on editing lead ");
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("sample_notefor_msg");
				driver.findElement(By.xpath("//input[@value='Update']")).click();
				Thread.sleep(5000);
				String title = driver.getTitle();
				System.out.println(title);
				driver.quit();
	}

}
