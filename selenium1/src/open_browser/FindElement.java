package open_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Vaibhav");
		driver.findElement(By.id("LastName")).sendKeys("Kalubarme");
		driver.findElement(By.id("Email")).sendKeys("vaibhavkalubarme7278@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Developtrees");
		driver.findElement(By.id("Password")).sendKeys("vaibhav");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("vaibhav");
		
		Thread.sleep(10000);
		driver.close();
	}

}
