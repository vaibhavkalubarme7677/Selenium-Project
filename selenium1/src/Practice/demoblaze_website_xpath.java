package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze_website_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys("vaibhavkalubarme8@gmail.com");
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vaibhavkalubarme8@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='contcont']//a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
		//For PopUp 
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='col-lg-3']//a[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[normalize-space()='Sony vaio i5']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
	    Thread.sleep(2000);
	    //For PopUp 
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id='cartur']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("name")).sendKeys("Vaibhav");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("card")).sendKeys("123456789");
		driver.findElement(By.id("month")).sendKeys("March");
		driver.findElement(By.id("year")).sendKeys("2024");
		
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
