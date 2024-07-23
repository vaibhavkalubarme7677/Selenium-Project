package OrangeHRM_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_PIM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prashant");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Priyanshu");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Naik");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("121212");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		//Form
		Thread.sleep(2000);
		
	    
	    
	}
}
