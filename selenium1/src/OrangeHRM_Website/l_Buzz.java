package OrangeHRM_Website;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class l_Buzz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();
		
		//What's on your mind
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Hello");
		
		//click Post button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Share Photos
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Share Photos']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-images orangehrm-photo-upload-icon']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("C://Users//DTLP116//Pictures//Camera Roll//general.png");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='orangehrm-buzz-post-modal-header-text']//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Happy Holi 2024");
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']//button[1]")).click();
		
        
        Thread.sleep(5000);
		driver.close();
		
		
	}

}
