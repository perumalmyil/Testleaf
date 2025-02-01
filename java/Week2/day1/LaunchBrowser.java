package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
		ChromeDriver driver=new ChromeDriver();
		//Opening the Web Page
		driver.get("https://www.facebook.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		//wait statement in java
		Thread.sleep(5000);
		//closing the browser
		driver.close();
	}

}
