package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerce_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    WebDriver driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com");
			driver.manage().window().maximize();
            
			//tag.class
			driver.findElement(By.cssSelector("a.ico-register")).click();
			Thread.sleep(3000);
            
			//tag#id
			driver.findElement(By.cssSelector("input#FirstName")).sendKeys("apple");
			Thread.sleep(3000);
			
			//tag[Attribute="value"]
			driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Jewelry");
			Thread.sleep(3000);
			
            //tag.class[Attribute="value"]
			driver.findElement(By.cssSelector("button.button-1.search-box-button[type=\"submit\"]")).click();
			Thread.sleep(5000);
			
			driver.close();

		
	}

}
