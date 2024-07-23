package Screenshots_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebDriverWait Wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	    WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		ele.click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
