package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XYZ_Bank_Website_Managerlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//For Bank Manager Login
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");//Website open
		driver.manage().window().maximize(); //Maximize window
		
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[ng-click='manager()']")).click(); //for Bank Manager Login
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-class=\"btnClass1\"]")).click();//add Customer 
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"fName\"]")).sendKeys("Vaibhav");//First Name
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"lName\"]")).sendKeys("Kalubarme");//Last Name
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"postCd\"]")).sendKeys("413305");//pincode
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();//click add customer button
				
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();//For PopUp 
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-class=\"btnClass2\"]")).click();//For open account
				
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='userSelect']")); //For customer dropdown
		Select s = new Select (dropdown1);
		s.selectByValue("6");
			    
		Thread.sleep(2000);
		WebElement dropdown2= driver.findElement(By.xpath("//select[@id='currency']"));//for currency dropdown
		Select q= new Select (dropdown2);
		q.selectByValue("Dollar");
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();//For process button
				
		Thread.sleep(2000);
		driver.switchTo().alert().accept();//For PopUp 
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-class=\"btnClass3\"]")).click();//for Customers button
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Vaibhav");
				
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"btn home\"]")).click();
				
		Thread.sleep(2000);
	    driver.close();
				
	}

}
