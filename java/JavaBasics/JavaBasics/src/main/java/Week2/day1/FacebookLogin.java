package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				//Opening the Web Page
				driver.get("https://www.facebook.com/");
				//Maximize browser window
				driver.manage().window().maximize();
				//wait statement in java
				Thread.sleep(5000);
				//passing user name field
				driver.findElement(By.id("email")).sendKeys("perumal.myil@gmail.com");
				//Passing password field
				WebElement Pass=driver.findElement(By.id("pass"));
				Pass.sendKeys("password");
				//Click on Login button
				driver.findElement(By.name("login")).click();
				//Get the Title Name of the Page
				String Page_title=driver.getTitle();
				System.out.println("Title of the current webPage is: "+Page_title);
				//wait statement for few seconds
				Thread.sleep(3000);
				//closing the browser
				driver.close();
	}

}
