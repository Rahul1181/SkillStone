package final_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class placeordermultipleItem {
	//TestNG get to know from where to start
	@Test(priority=1)
	public void phoneorder() throws InterruptedException {
		//Access the Browser
		DemoBlaze.browser();
		DemoBlaze.waitfun();
		//Product Selection
		DemoBlaze.driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		DemoBlaze.waitfun();
		//Add to 2 items in Cart
		DemoBlaze.driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		DemoBlaze.driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		//Move to cart section
		DemoBlaze.driver.findElement(By.id("cartur")).click();
		DemoBlaze.waitfun();
		//Validate for quanity and cost of the product
		String check1=DemoBlaze.driver.findElement(By.xpath("//h3[text()='720']")).getText();
		Assert.assertEquals("720", check1);
		System.out.println("So quantity Purchased is 2 and total is "+check1);
		Thread.sleep(3000);
		//Place the order
		DemoBlaze.driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		//Add the details
		DemoBlaze.payDetails();
		DemoBlaze.waitfun();
		//Click on Purchase button
		DemoBlaze.driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		//Purchase confirmation
		DemoBlaze.driver.findElement(By.xpath("//button[text()='OK']")).click();
		//Navigate to homepage
		DemoBlaze.homepagelink();
		
	}

}
