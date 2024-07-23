package Window_Handling;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Seperate_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		
	    Set<String> win=driver.getWindowHandles();
        
	    for(String w:win)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title=driver.getTitle();
			String title1="Index";
          if(title.equals(title1))
			{
				System.out.println("Multiple Window");
				driver.findElement(By.xpath("//img[@id='enterimg']")).click();
				Thread.sleep(3000);
			}
		}
	    driver.quit();
	}

}


