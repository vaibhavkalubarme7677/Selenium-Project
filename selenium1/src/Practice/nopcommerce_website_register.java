package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class nopcommerce_website_register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")).click();
		
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Vaibhav");
		driver.findElement(By.id("LastName")).sendKeys("Kalubarme");
		driver.findElement(By.id("Email")).sendKeys("vaibhavkalubarme29@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Developtrees");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]")).click();
	
	    //Search product
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]")).sendKeys("Apple MacBook Pro 13-inch");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-4")).click();
		
		driver.findElement(By.className("cart-label")).click();
		
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("vaibhavkalubarme29@gmail.com");
		driver.findElement(By.cssSelector("input[class=\"password\"]")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"termsofservice\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
		Thread.sleep(2000);
		//For PopUp 
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[id=\"checkout\"]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("");
		
		Select dropdown = new Select (driver.findElement(By.cssSelector("#BillingNewAddress_CountryId")));
		dropdown.selectByVisibleText("India");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("413305");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("1234567891");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
