package OrangeHRM_Website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class f_My_Info {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		
		//First Name
		 Thread.sleep(3000);
		 Actions act1 = new Actions(driver);
		 WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		 act1.click(FirstName).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 FirstName.sendKeys("Priyanshu");
		 
		//Middle Name
		 Thread.sleep(2000);
		 Actions act2 = new Actions(driver);
		 WebElement MiddleName = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		 act2.click(MiddleName).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 MiddleName.sendKeys("Prashant");
		 
		 //Last Name
		 Thread.sleep(2000);
		 Actions act3 = new Actions(driver);
		 WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		 act3.click(LastName).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 LastName.sendKeys("Naik");
		 
		 
		 //Thread.sleep(2000);
	     // driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]")).sendKeys("Prshu");
	    
		 
		 //Emp ID
		 Thread.sleep(2000);
		 Actions act4 = new Actions(driver);
		 WebElement EmpID = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]"));
		 act4.click(EmpID).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 EmpID.sendKeys("E12345");
		 
		
		 //Other ID
		 Thread.sleep(2000);
		 Actions act5 = new Actions(driver);
		 WebElement OtherID = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		 act5.click(OtherID).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 OtherID.sendKeys("123456");
		 
		 //Driving License 
		Thread.sleep(2000);
		 Actions act6 = new Actions(driver);
		 WebElement DrivingLicense = driver.findElement(By.xpath("(//input)[7]"));
		 act6.click(DrivingLicense).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		 Thread.sleep(1000);
		 DrivingLicense.sendKeys("DL121212");
		 
		 
	    //License Expiry Date
		Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    WebElement licenseExpiry = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
	    act.click(licenseExpiry).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		licenseExpiry.sendKeys("2024-30-12");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@class='oxd-date-input-link --close']")).click();
	    Thread.sleep(3000);
	    
		//Nationality dropdown
		driver.findElement(By.xpath("(//i)[7]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Indian']")).click();
		 
		//Marrital Status
		driver.findElement(By.xpath("(//i)[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Single']")).click();
		
		
	    //Date of Birth
	    Actions actq = new Actions(driver);
	    WebElement DateofBirth = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	    actq.click(DateofBirth).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		DateofBirth.sendKeys("1999-30-12");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@class='oxd-date-input-link --close']")).click();
	    Thread.sleep(3000);
	    
	    //Gender
	    driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	    
	    //Save
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
	    
	   //Blood Type
	  	driver.findElement(By.xpath("//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
	  	Thread.sleep(4000);
	  	driver.findElement(By.xpath("//span[normalize-space()='A+']")).click();
	  	
	  	//Test Field
	  	Thread.sleep(2000);
	    Actions act7 = new Actions(driver);
	    WebElement TestField = driver.findElement(By.xpath("//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
	    act7.click(TestField).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
	  	Thread.sleep(1000);
	  	TestField.sendKeys("N/A");
	  	 
	  	 
	  	//Save
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='orangehrm-custom-fields']//button[@type='submit'][normalize-space()='Save']")).click();
	  	
	  		
	     //ADD Attachments
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
	    driver.switchTo().activeElement().sendKeys("C://Users//DTLP116//Pictures//Camera Roll//general.png");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("N/A");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")).click();
	    
	   
	    Thread.sleep(2000);
	    driver.close();
	}

}
