package commands;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");    //will wait until total page loaded
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.snapdeal.com");   //not wait until total page loaded
		Thread.sleep(3000);
		driver.navigate().back();     //go to amazon
		Thread.sleep(3000);
		driver.navigate().forward();  //go to snapdeal
		Thread.sleep(3000);
		driver.navigate().refresh();  //refresh page
		Thread.sleep(3000);
		driver.close();
	}

}
