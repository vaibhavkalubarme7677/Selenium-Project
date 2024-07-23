package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Alert with OK \"]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("This is my test alert");
		driver.switchTo().alert().accept();
	
	    Thread.sleep(2000);
		driver.close();
	
	}

}
