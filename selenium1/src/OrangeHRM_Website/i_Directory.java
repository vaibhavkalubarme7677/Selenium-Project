package OrangeHRM_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class i_Directory {

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
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Directory']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Christopher Bridges");
		
		//job title
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
	
		//job location
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[50]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='New York Sales Office']")).click();
		
		//Search
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
