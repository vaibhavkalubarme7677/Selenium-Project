package Task;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;


public class Shopclues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//open phone web site
		driver.findElement(By.xpath("//div[@class='container']//li[1]//a[1]//img[1]")).click();
		Thread.sleep(4000);
		
		
		//open APPLE iPhone 6,64 GB
		Set<String> win=driver.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title = driver.getTitle();
			String title1="Online Shopping Store | Buy Online: Mobiles Phone, Computers, Tablets Pc, Home Appliances | Lowest Price shop in India at ShopClues";
			if(title.equals(title1))
			{
				System.out.println("APPLE iPhone 6 window");
				Thread.sleep(2000);
				
			}
		}
		
		//for selecting apple iphone6
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='det_img_153348456']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		Set<String> ten=driver.getWindowHandles();
		for(String w:ten)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title = driver.getTitle();
			String title1=" Buy (Refurbished) APPLE iPhone 6, 64 GB - Superb Condition, Like New Online - Get  77% Off ";
			if(title.equals(title1))
			{
				System.out.println("mobiles window");
				Thread.sleep(2000);
				
			}
		}
		Thread.sleep(3000);
		//add to cart apple iphone 6
		driver.findElement(By.xpath("//span[@id='5411348']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='add_cart']")).click();
		
		
		//for selecting second product
		Thread.sleep(2000);
		//jump on main page
		Set<String> one=driver.getWindowHandles();
		for(String w:one)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title = driver.getTitle();
			String title1="Online Shopping Store | Buy Online: Mobiles Phone, Computers, Tablets Pc, Home Appliances | Lowest Price shop in India at ShopClues";
			if(title.equals(title1))
			{
				System.out.println("Cart Window vivo ");
				Thread.sleep(2000);
				
			}
		}
		Thread.sleep(2000);
		//click on vivo Y71 mobile
		driver.findElement(By.xpath("//h4[contains(text(),'(Refurbished) Vivo Y71 (Y71A) (4 GB RAM, 64 GB Sto')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		Set<String>  two =driver.getWindowHandles();
		for(String w:two)
		{
			System.out.println(w);
			driver.switchTo().window(w);
			String title = driver.getTitle();
			String title1=" Buy (Refurbished) Vivo Y71 (Y71A) (4 GB RAM, 64 GB Storage) - Superb Condition, Like New Online - Get  72% Off ";
			if(title.equals(title1))
			{
				System.out.println("mobiles window");
				
			}
		}
		//click on Add to  cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='5411347']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add_cart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='cart_ic']")).click();
		
		Thread.sleep(8000);
		driver.quit();
	}
		
}


