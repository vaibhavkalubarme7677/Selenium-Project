package open_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");                            //website URL
		driver.manage().window().maximize();                                 //Maximize the window
		       
		driver.findElement(By.id("user-name")).sendKeys("standard_user");    //UserName
		driver.findElement(By.name("password")).sendKeys("secret_sauce");    //Password
		driver.findElement(By.name("login-button")).click();                 //clickLoginButton
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); //add to cart
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();       //Shopping cart link
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();                        //Click Checkout
		
		driver.findElement(By.id("first-name")).sendKeys("Vaibhav");         //Filling FirstName
		driver.findElement(By.id("last-name")).sendKeys("Kalubarme");        //Filling LastName
		driver.findElement(By.id("postal-code")).sendKeys("413305");         //Filling PostalCode
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();                       //click continue
		driver.findElement(By.name("finish")).click();                       //Last Finish
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("back-to-products")).click();              //Back to the Products
		
		Thread.sleep(3000);
		driver.close();                                                     //Close Window 
	}

}
