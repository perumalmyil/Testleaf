package Week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		//initializing the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Opening the Web Page
				driver.get("https://www.leafground.com/radio.xhtml");
				//Maximize browser window
				driver.manage().window().maximize();
				//finding the fav browser
				WebElement safari_brw = driver.findElement(By.xpath("//input[@id='j_idt87:console1:2'and@type='radio']/../.."));
				System.out.println("safari radio buttion is enabled:"+safari_brw.isEnabled());
				safari_brw.click();
				//selecting next button select and unselect
				WebElement Chennai = driver.findElement(By.xpath("//input[@id='j_idt87:city2:0'and @value='Chennai']/../.."));
				Chennai.click();
				Thread.sleep(4000);
				Chennai.click();
				List<WebElement> rbuttons = driver.findElements(By.xpath("//input[contains(@id,'j_idt87:console2')]"));
				//iterate over loop to find which is selected
											
				for (int i = 0; i < rbuttons.size(); i++) {
					if(rbuttons.get(i).isSelected())
					{
						System.out.print("radio button selected default for browse is: ");
						System.out.println(driver.findElement(By.xpath("//input[contains(@id,'j_idt87:console2"+":"+(i)+"')]/following::label")).getText());
						}
					
				}
				// find the 21-40 years button selected or not 
				WebElement age2 = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
				System.out.println("age group selected?:"+age2.getAttribute("checked"));
				String actual = age2.getAttribute("checked");
				String exp="checked";
				if(actual.equalsIgnoreCase(exp))
				{
					System.out.println("age group is already selected, so we leave as it is");
				}
				else {
					age2.click();				}
				
				}
				
				
				
	
	
	}


