package final_Project;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class emptyCart {
	////TestNG get to know from where to start
	@Test(priority=1)
	public void phoneorder() throws InterruptedException {
		//Access the Browser from DemoBlaze class
		DemoBlaze.browser();
		DemoBlaze.waitfun();
		//Click on the cart link under title section
		DemoBlaze.driver.findElement(By.id("cartur")).click();
		DemoBlaze.waitfun();
		//Click on the PlaceOrder Button 
		DemoBlaze.driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		//Accessing method from BaseCalss for credentials
		DemoBlaze.payDetails();
		DemoBlaze.waitfun();
		//Click on Purchase button
		DemoBlaze.driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		DemoBlaze.waitfun();
		
		//Validate for empty cart confirmation 
		String check1=DemoBlaze.driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
		Assert.assertEquals("Thank you for your purchase!", check1);
		System.out.println("Hello Sukvinder "+check1);
		Thread.sleep(3000);
		
		//Click on the OK button
		DemoBlaze.driver.findElement(By.xpath("//button[text()='OK']")).click();
		//Return top Homepage
		DemoBlaze.homepagelink();
	}

}
