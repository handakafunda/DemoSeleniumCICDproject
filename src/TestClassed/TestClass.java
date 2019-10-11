package TestClassed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver;
	
	@BeforeMethod
	public void initalizeDriver() {
		String browser = "Chrome";
		if(browser == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonu.choudhary\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void Test1() {
		        driver.navigate().to("https://www.seleniumhq.org");      
				driver.findElement(By.id("q"));
				System.out.println("title of the page is "+ driver.getTitle());
				Assert.assertEquals(true, true);
			}

	@Test
	public void Test2() {
		driver.navigate().to("https://www.google.com");  
		String title = "Selenium";
		System.out.println("title of the page is "+ driver.getTitle());
		Assert.assertEquals(true, true);
	}
	
	@AfterMethod
	public void Quit() {
		driver.quit();
	}

	
	
}
