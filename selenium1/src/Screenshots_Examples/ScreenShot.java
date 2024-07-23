package Screenshots_Examples;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\Screenshot\\screenshot1.png");
		FileHandler.copy(src, target);
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='col-md-12']"));
		TakesScreenshot ts=(TakesScreenshot)ele;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\Screenshot\\screenshot2.jpg");
		FileHandler.copy(src, target);*/
		
		Thread.sleep(3000);
		driver.close();		
	}

}
