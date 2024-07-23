package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class luma_Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Men")).click();
		driver.findElement(By.linkText("Jackets")).click();
		
		driver.findElement(By.className("product-item-link")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-166")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-49")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		
		Thread.sleep(2000);
		driver.navigate().back(); 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Montana Wind Jacket']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-166']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='option-label-color-93-item-58']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
