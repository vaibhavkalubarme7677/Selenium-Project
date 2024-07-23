package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.name("DateOfBirthDay"));
		Select s = new Select(drp); 	
		
	       s.selectByValue("7");
		 //s.selectByVisibleText("10");
	    // s.selectByIndex(15);
		  
		  Thread.sleep(5000);
		  driver.close();
		  
	}

}
