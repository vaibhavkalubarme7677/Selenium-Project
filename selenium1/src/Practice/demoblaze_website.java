package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		//For maximize page window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//For selecting samsung galaxy S6 mobile phone
		driver.findElement(By.className("hrefch")).click();
		
		Thread.sleep(2000);
		//Selecting add to cart
		driver.findElement(By.cssSelector("a[onclick='addToCart(1)']")).click();
		
		Thread.sleep(2000);
		//For PopUp 
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		//For opening Cart folder
		driver.findElement(By.cssSelector("a[href=\"cart.html\"]")).click();
		
		Thread.sleep(2000);
		//For selecting Place order button
		driver.findElement(By.cssSelector("button[class=\"btn btn-success")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Vaibhav");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("card")).sendKeys("123456789");
		driver.findElement(By.id("month")).sendKeys("March");
		driver.findElement(By.id("year")).sendKeys("2028");
		
		Thread.sleep(2000);
		//For Selecting Purchase button
		driver.findElement(By.cssSelector("button[onclick=\"purchaseOrder()\"]")).click();
		
		Thread.sleep(5000);
		//Thank You For Your Purchase! then press "OK" button 
		driver.findElement(By.cssSelector("button[class=\"confirm btn btn-lg btn-primary\"]")).click();
		
		Thread.sleep(2000);
		//Then lastly close window
		driver.close();
		
		}

}
