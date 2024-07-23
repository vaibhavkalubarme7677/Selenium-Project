package commands;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class get_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");//we can open url
		driver.manage().window().maximize();        //Maximize the url
		
		System.out.println(driver.getCurrentUrl());//https://demo.nopcommerce.com/
		
		String expected="nopCommerce demo store";//nopCommerce demo store
		String actual=driver.getTitle();
		
		if(expected.equals(actual))
		{
			System.out.println("opened the correct page");
		}
        else
		{
			driver.close();
		}
		System.out.println(driver.getPageSource());
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
