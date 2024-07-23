package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		
		//Enter
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		//Back_Space
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		//a
		Thread.sleep(2000);
		act.sendKeys("a").perform();
		
		// down--------up
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
