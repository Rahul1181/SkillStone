package final_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	//Global driver
	static WebDriver driver;
	//Method to access the chrome Browser
	public static void browser() {
		//Access the chrome Driver
		System.setProperty("webdriver.chrome.driver","D:\\SKILLSTONE\\Selenium\\LoginToDemoblaze\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//Visit website
		driver.navigate().to("https://www.demoblaze.com/index.html#");
	}
	//sets the time to wait for a page to load completely
	public static void waitfun() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	//Details to fill in new Message of contact section
	public static void inputsetup() {
		driver.findElement(By.id("recipient-email")).sendKeys("admin");
		driver.findElement(By.id("recipient-name")).sendKeys("Rahul");
		driver.findElement(By.id("message-text")).sendKeys("Thankyou for the service I am totally satisfied from it");
	}
	//Credentials for signup
	public static void credentials() {
		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='sign-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='sign-password']")).sendKeys("admin");
	}
	//Switch to prompt alert
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	//Credentials for login 
	public static void logincred() {
		driver.findElement(By.id("loginusername")).sendKeys("admin");
		driver.findElement(By.id("loginpassword")).sendKeys("admin");
	}
	//Payment Details
	public static void payDetails() {
		driver.findElement(By.id("name")).sendKeys("Sukvinder");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Phagwara");
		driver.findElement(By.id("card")).sendKeys("4826154289753641");
		driver.findElement(By.id("month")).sendKeys("08");
		driver.findElement(By.id("year")).sendKeys("2040");
	}
	//Navigate to homepage
	public static void homepagelink() {
		driver.navigate().to("https://www.demoblaze.com/index.html#");
	}
	
}
