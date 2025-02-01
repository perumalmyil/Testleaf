package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Opening the Web Page
				driver.get("https://leafground.com/button.xhtml");
				//Maximize browser window
				driver.manage().window().maximize();
				//Click and Confirm title.
				driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'and(contains(text(),'Click'))]")).click();
				String Act_title = driver.getTitle();
				String Exp_title="Dashboard";
				if(Act_title.equals(Exp_title))
				{
					System.out.println("Click and confirm verified with dashborad launch");
				}
				driver.navigate().back();
				//Confirm if the button is disabled.
				WebElement disabledelement = driver.findElement(By.xpath("//div[@class='card']//span[text()='Disabled']"));
				if(disabledelement.isEnabled()) {System.out.println("button enabled");}
				else {System.out.println("button disabled");}
	
	}

}
