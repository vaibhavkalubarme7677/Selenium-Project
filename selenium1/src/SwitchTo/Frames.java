package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
		
		//switch to iframe
        driver.switchTo().frame("SingleFrame");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test Data");
		 Thread.sleep(5000);
		//come out from the iframe
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]")));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iFrame Text");
		
		Thread.sleep(2000);
		driver.close();
		
			
	}

}
