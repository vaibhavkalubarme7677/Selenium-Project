package Window_Handling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_New_Seperate_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//System.out.println(driver.getWindowHandle());
		//96E8C2425FD1C6A3F24A633F898CFFAE
		//CDCA413444348C77695B1F0DB5C02E20
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> win=driver.getWindowHandles();
        
		for(String w:win)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title=driver.getTitle();
			String title1="Selenium";
			if(title.equals(title1))
			{
				System.out.println("child window");
				driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
				Thread.sleep(3000);
			}
		}
		driver.quit();
	}
		
}
		
		
	


