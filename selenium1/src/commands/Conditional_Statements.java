package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("Newsletter"));
		if (((ele.isDisplayed()==true && ele.isSelected()==false)) && (ele.isEnabled()==true ))
		{
			ele.click();
		}
		else 
		{
			System.out.println("Newsletter checkbox is checked");
		}
	}
		
 }


