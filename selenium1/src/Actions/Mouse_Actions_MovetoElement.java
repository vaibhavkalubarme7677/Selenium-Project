package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mouse_Actions_MovetoElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Selenium']")).click();
		
		WebElement e1=driver.findElement(By.xpath("//a[normalize-space()='Flash Movie Demo']"));
		WebElement e2=driver.findElement(By.xpath("//a[normalize-space()='Radio & Checkbox Demo']"));
	    WebElement e3=driver.findElement(By.xpath("//a[normalize-space()='Table Demo']"));
		WebElement e4=driver.findElement(By.xpath("//a[normalize-space()='Accessing Link']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(e1).build().perform();
		Thread.sleep(2000);
        act.moveToElement(e2).build().perform();
		Thread.sleep(2000);
		act.moveToElement(e3).build().perform();
		Thread.sleep(2000);
		act.moveToElement(e4).click().build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
