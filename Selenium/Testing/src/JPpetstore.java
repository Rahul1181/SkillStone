//Open JP Pet store and display all birds

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPpetstore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SKILLSTONE\\Selenium\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");
		driver.findElement(By.xpath("//a[text()='AV-CB-01']")).click();
		driver.findElement(By.xpath("//a[text()='EST-18']")).click();
		//Sleep for 5 sec
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Return to AV-CB-01']")).click();
		driver.findElement(By.xpath("//a[text()='Return to BIRDS']")).click();
		driver.findElement(By.xpath("//a[text()='AV-SB-02']")).click();
		driver.findElement(By.xpath("//a[text()='EST-19']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
