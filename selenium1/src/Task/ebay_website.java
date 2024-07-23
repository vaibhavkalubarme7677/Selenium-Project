package Task;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='vl-module vl-item-card-list-dic vl-atf-module-js ITEM_CARD_CAROUSEL_DIC_V2 vl-item-card-list-dic-dsa']/div/div[@role='group']/div[contains(@id,'s0-1-0-47-1-3-5-10-0')]/div[@class='carousel__viewport']/ul[contains(@id,'s0-1-0-47-1-3-5-10-0')]/li[3]/div[1]/a[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(2000);
		Set<String> win=driver.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			
			if(driver.getTitle().equals("Apple iPhone 13 Pro Max, A2484, 256GB, Unlocked, Excellent Condition  | eBay"))
			{
				System.out.println("Apple iPhone 13 Pro Max");
			}
		}
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']"));
		Select s = new Select (dropdown1);
		s.selectByValue("0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='vim x-atc-action overlay-placeholder']//a[@class='ux-call-to-action fake-btn fake-btn--fluid fake-btn--large fake-btn--primary']")).click();
		
	
		//second product
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Apple iPhone 14 Pro Max 256GB Gold Unlocked Excell')]")).click();
		
		Thread.sleep(2000);
		Set<String> win1=driver.getWindowHandles();
		for(String w:win1)
		{
			System.out.println(w);
			driver.switchTo().window(w);
		
			if(driver.getTitle().equals("Apple iPhone 14 Pro Max 256GB Gold Unlocked Excellent Condition 194253378839 | eBay"))
			{
				System.out.println("Apple iPhone 14 Pro Max");
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		Thread.sleep(7000);
		driver.quit();
		
	}
}
