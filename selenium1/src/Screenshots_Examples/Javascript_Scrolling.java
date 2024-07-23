package Screenshots_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.nopcommerce.com/");
	      driver.manage().window().maximize();
	     
	    
	      Thread.sleep(3000);
	      JavascriptExecutor js=(JavascriptExecutor) driver;
	    
	     //Top to Middle
	      Thread.sleep(3000);
	      js.executeScript("window.scrollBy(0,1000)","");
	 
	     //scrolling down
	      Thread.sleep(3000);
	      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	   
	      //alternate for click
	      Thread.sleep(3000);
	      WebElement s=driver.findElement(By.xpath("//a[normalize-space()='Search']"));
	      js.executeScript("arguments[0].click()",s);
	     
	      Thread.sleep(3000);
	      driver.close();
	    
		
	}

}
