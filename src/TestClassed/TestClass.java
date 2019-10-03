package TestClassed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver;
	
	
	@Test
	public void Test1() {
		

	
				String browser = "Chrome";
				if(browser == "Chrome") {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonu.choudhary\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				}else {
					driver = new FirefoxDriver();
				}
			 
				driver.get("https://www.seleniumhq.org");
	            
				driver.findElement(By.id("q"));
				Assert.assertEquals(true, true);
			}

	@Test
	public void Test2() {
		String title = "Selenium";
		Assert.assertEquals(true, true);
	}

	
	
}
