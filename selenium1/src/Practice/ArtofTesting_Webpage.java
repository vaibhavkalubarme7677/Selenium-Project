package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArtofTesting_Webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("Vaibhav");//Textbox
		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();//Submit button
		
		
		driver.findElement(By.id("male")).click(); //Radio button
		
		Thread.sleep(2000);
		WebElement ele  = driver.findElement(By.xpath("//input[@value='Automation']"));//Checkbox
		if ((ele.isDisplayed()==true && ele.isSelected()==false) && (ele.isEnabled()==true))
        {
        	ele.click();
	    }
		
		Thread.sleep(2000);
		WebElement drp = driver.findElement(By.xpath("//select[@id='testingDropdown']"));//Dropdown
		Select s = new Select (drp);
		s.selectByValue("Automation");
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
