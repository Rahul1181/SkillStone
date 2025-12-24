package final_Project;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class placeOrderwithoutCred {
	//TestNG get to know from where to start
	@Test(priority=1)
	public void phoneorder() throws InterruptedException {
		//Access the browser
		DemoBlaze.browser();
		DemoBlaze.waitfun();
		//Select the product
		DemoBlaze.driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).click();
		//Add to Cart
		DemoBlaze.driver.findElement(By.xpath("//a[@onclick='addToCart(8)']")).click();
		//Move to cart section 
		DemoBlaze.driver.findElement(By.id("cartur")).click();
		DemoBlaze.waitfun();
		//Place order
		DemoBlaze.driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		DemoBlaze.waitfun();
		//Purchase the product
		DemoBlaze.driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		//Validate for error message alert
		Alert alert=DemoBlaze.driver.switchTo().alert();
		Assert.assertEquals("Please fill out Name and Creditcard.", alert.getText());
		System.out.println(alert.getText());
		//Move to prompt simple alert 
		DemoBlaze.simpleAlert();
		Thread.sleep(3000);
		DemoBlaze.driver.findElement(By.xpath("//div[@id='orderModal']//button[@class='btn btn-secondary'][text()='Close']")).click();
		
		//Validate for close button to revert back to products
		String check1=DemoBlaze.driver.findElement(By.xpath("//h2[text()='Products']")).getText();
		Assert.assertEquals("Products", check1);
		System.out.println("You are reverted back to "+check1);
		
		
	}

}
