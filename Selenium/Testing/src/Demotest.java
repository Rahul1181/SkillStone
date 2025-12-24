import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SKILLSTONE\\Selenium\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("www.grazitti.com");
		//div[@class="FPdoLc lJ9FBc"]/center/input[@name="btnK"];
		//div[@class="FPdoLc lJ9FBc"]//input[@name="btnK"]
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		driver.quit(); //It quits from the browser
	}

}
