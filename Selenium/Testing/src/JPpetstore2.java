import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPpetstore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SKILLSTONE\\Selenium\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		
		//The password is auto generated so we don't have to write
		//driver.findElement(By.name("password")).click();      
		
		driver.findElement(By.name("signon")).click();
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");
		driver.findElement(By.xpath("//a[text()='FI-SW-01']")).click();
		driver.findElement(By.xpath("//a[text()='EST-2']")).click();
		driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();
		driver.findElement(By.name("EST-2")).clear();
		driver.findElement(By.name("EST-2")).sendKeys("2");
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		driver.findElement(By.name("shippingAddressRequired")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		
		
		

	}

}
