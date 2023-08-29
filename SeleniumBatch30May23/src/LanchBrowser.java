import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanchBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		/*
		 * System.setProperty("webdrive.chrome.drive",
		 * "C:\\Users\\salim\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.amazon.com/");
		 */
	
	
	WebDriverManager.chromedriver().setup();
	
	
	
	 driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	WebDriverManager.firefoxdriver();
	
	driver = new FirefoxDriver();
	
	driver.get("https://www.amazon.com/");

	}

}
