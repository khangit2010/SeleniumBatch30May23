package FindingLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLocators {
	
	public static WebDriver driver;

	public static void main(String[] args) {
driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//By ID
		
WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		
		checkBox.click();
		
		//By class name
	
		List<WebElement> radioButtons= driver.findElements(By.className("radioButton"));
		
		for(int i = 0; i <= radioButtons.size(); i++ ) {
			
			  if (i==2) {
				  
				  radioButtons.get(i).click();
			  }
			  
			  
		
	}


	}

}
