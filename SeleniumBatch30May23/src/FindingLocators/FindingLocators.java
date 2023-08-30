package FindingLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLocators {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// By ID

		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));

		checkBox.click();

		// By class name

		List<WebElement> radioButtons = driver.findElements(By.className("radioButton"));

		for (int i = 0; i <= radioButtons.size(); i++) {

			if (i == 2) {

				radioButtons.get(i).click();
			}

			// 4) link Text
			// <a href="http://www.restapitutorial.com/"> REST API </a>
//				driver.findElement(By.linkText("REST API")).click();

			// 5) partial link Text
//				driver.findElement(By.partialLinkText("REST")).click();

			// 6) Tagname

			// List <WebElement> nOfLinks= driver.findElements(By.tagName("a"));
			// System.out.println(nOfLinks.size());

			// 7) Xpath
			// <input value="option1" type="checkbox">
			// Formula --> //TagName[@Attribute='AttributeValue']

			driver.findElement(By.xpath("//input[@value='option1']")).click();

			// 7.1) * xpath

			driver.findElement(By.xpath("//*[@value= 'radio1']")).click();

			Thread.sleep(2500);
			
			//7.2

		}

	}

}
