package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XYZ_Bank_Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//For Customer Login
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");//Website open
		driver.manage().window().maximize(); //Maximize window
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[ng-click='customer()']")).click(); //Customer login
		
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("userSelect")); //Selecting dropdown HarryPotter
		Select r = new Select (dropdown);
		r.selectByValue("2");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); //Login
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[ng-class=\"btnClass2\"]")).click();//click deposit button
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("100");//Enter deposit amount

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();////click deposit button
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[ng-class=\"btnClass3\"]")).click(); //click Withdrawl button
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='amount']")).sendKeys("50");//Withdrawl amount 
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();//click Withdrawl button
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[ng-class=\"btnClass1\"]")).click();//click Transactions button
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[ng-click='back()']")).click();//click back button
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[ng-show=\"logout\"]")).click();//Logout
		
		Thread.sleep(2000);
	    driver.close();
		
	}

}
