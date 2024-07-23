package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Right click and copy
		WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions (driver);
		act.contextClick(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//Double click and press ok button for popup
		WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		act.doubleClick(ele1).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
