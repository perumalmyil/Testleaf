package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
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
				driver.findElement(By.xpath("(//input[@id='accountName'])")).sendKeys("MylTestAccount");
				//passing Description
				driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium Automation Tester");
				//selecting industry
				WebElement industry_element = driver.findElement(By.name("industryEnumId"));
				Select industry=new Select(industry_element);
				industry.selectByValue("IND_SOFTWARE");
				//selecting ownership
				WebElement ownership_element = driver.findElement(By.name("ownershipEnumId"));
				Select ownership=new Select(ownership_element);
				ownership.selectByVisibleText("S-Corporation");
				//selecting source
				WebElement source_element = driver.findElement(By.name("dataSourceId"));
				Select source=new Select(source_element);
				source.selectByValue("LEAD_EMPLOYEE");
				//select Marketing campaign marketingCampaignId
				WebElement campaign_element = driver.findElement(By.name("marketingCampaignId"));
				Select campaign=new Select(campaign_element);
				campaign.selectByIndex(6);
				//Select the state
				WebElement state_element = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select state=new Select(state_element);
				state.selectByValue("TX");
				//passing site name as LeafTaps
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				//create account button click
				driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				String title = driver.getTitle();
				System.out.println(title);
				WebElement username = driver.findElement(By.xpath("//span[contains(text(),'MylTestAccount')]"));
				
				if(username.isDisplayed())
				{
					System.out.println("test passed");
				}
				else {
					System.out.println("case failed :  title is not same to verify");
				}
				
				
				driver.quit();
	}

}
