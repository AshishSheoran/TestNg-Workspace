package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestNG_SeleniumParametersParallelExample {

	WebDriver driver;
	String baseURL;

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(String browser) {
		baseURL = "https://www.facebook.com";

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ashu/geckodriver");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ashu/chromedriver");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test

	public void testLogin() throws InterruptedException {
		WebElement emailField = driver.findElement(By.id("email")); // To find the email/phoneNumber field box
		emailField.sendKeys("userMail@gmail.com"); // To enter the values into email box
		WebElement passwordField = driver.findElement(By.id("pass"));// To find the password field box
		passwordField.sendKeys("password"); // To enter the values into password box
		WebElement loginButton = driver.findElement(By.name("login")); // To find the login button
		loginButton.click(); // To click the login button.
	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
