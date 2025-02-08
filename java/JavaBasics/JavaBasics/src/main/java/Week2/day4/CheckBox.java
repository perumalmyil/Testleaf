package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Opening the Web Page
				driver.get("https://leafground.com/checkbox.xhtml");
				//Maximize browser window
				driver.manage().window().maximize();
				WebElement basic_chkbox = driver.findElement(By.className("ui-chkbox-label"));
				basic_chkbox.click();
				WebElement Notification_chkbox = driver.findElement(By.xpath("//span[contains(text(),'Ajax')]"));
				Notification_chkbox.click();
				driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).isDisplayed();
				WebElement Language_chkbox = driver.findElement(By.xpath("//label[contains(text(),'Java')]"));
				Language_chkbox.click();
				WebElement Tri_state = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]"));
				Tri_state.click();
//				if(Tri_state.isSelected())
//				{
//					System.out.println("Tristate chkbox is selected");
//				}
//				else {System.out.println("Tristate is not selected");}
				WebElement Toggle_stch = driver.findElement(By.className("ui-toggleswitch-slider"));
				Toggle_stch.click();
				WebElement disabled_chkbox = driver.findElement(By.id("j_idt87:j_idt102"));
				if(disabled_chkbox.isEnabled())
				{
					System.out.println("Chkbox was enabled");
				}
				else {System.out.println("chkbox was disabled: Test passed");}
				WebElement Multiple_opt = driver.findElement(By.className("ui-selectcheckboxmenu-multiple-container"));
				Multiple_opt.click();
				Thread.sleep(3000);
				//selecting options
				driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[12]")).click();
				driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[14]")).click();
				driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
				System.out.println("Testing sucessfully completed");
				driver.quit();
	
	}
	

}
