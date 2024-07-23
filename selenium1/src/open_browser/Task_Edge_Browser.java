package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Task_Edge_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EdgeOptions w = new EdgeOptions();
		w.addArguments ("--remote-allow-origins=*");
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://www.amazon.com/");
		
	}

}
