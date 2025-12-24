//Open demoblaze site and filer all phones

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {
	public static void main(String[] args) {
		//Access the chrome Driver
		System.setProperty("webdriver.chrome.driver","D:\\SKILLSTONE\\Selenium\\Testing\\Driver\\chromedriver.exe");
		
		//Initiate the web driver of Google Chrome
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com/index.html#");
		
		//Finds the path of the phone category
		driver.findElement(By.xpath("//a[text()='Phones']")).click();
		
		
		//Didn't worked due to parenthesis
		//driver.findElement(By.xpath("//*[@onclick='byCat('phone')']")).click();   
		//Resolved the issue of parenthesis
		//driver.findElement(By.xpath("//a[@onclick=\"byCat('phone')\"]")).click();

	}

}
