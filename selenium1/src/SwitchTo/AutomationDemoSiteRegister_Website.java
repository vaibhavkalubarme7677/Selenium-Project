package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationDemoSiteRegister_Website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kalubarme");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Pune");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vaibhavkalubarme7278@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
		/*Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//div[@id='msdd']"));
		Select w = new Select (dropdown);
		w.selectByVisibleText("English");*/
		
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select (dropdown1);
		s.selectByValue("Java");
		
		/*Thread.sleep(2000);
		WebElement dropdown2 = driver.findElement(By.xpath("//span[@role='combobox']"));
		Select q = new Select (dropdown2);
		q.selectByValue("India");*/
		
		Thread.sleep(2000);
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select t = new Select (dropdown3);
		t.selectByValue("1999");
		
		Thread.sleep(2000);
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select y = new Select (dropdown4);
		y.selectByValue("March");
		
		Thread.sleep(2000);
		WebElement dropdown5 = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select u = new Select (dropdown5);
		u.selectByValue("2");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Pass@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Pass@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:/Users/DTLP116/Pictures/Camera Roll/general.png");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
