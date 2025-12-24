package final_Project;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class contactsection {
	//TestNG get to know from where to start
	@Test(priority=1)
	public void contact() throws InterruptedException {
		//Access the Browser form DemoBlaze
		DemoBlaze.browser();
		//Click on the Contact link on homepage
		DemoBlaze.driver.findElement(By.xpath("//a[text()='Contact']")).click();
		//Validates contact link is clicked or not
		Thread.sleep(3000);
		String check1=DemoBlaze.driver.findElement(By.xpath("//h5[text()='New message']")).getText();
		Assert.assertEquals("New message",check1);
		
	}
	@Test(priority=2)
	public void blankmessage() throws InterruptedException {
		DemoBlaze.waitfun();
		//Click on the send Message button
		DemoBlaze.driver.findElement(By.xpath("//*[text()='Send message']")).click();
		//Alert Prompt validation
		Alert alert=DemoBlaze.driver.switchTo().alert();
		//Check if we send blank message it gives error or not
		Assert.assertEquals("Thanks for the message!!",alert.getText());
		DemoBlaze.waitfun();
		//Deals with the alert
		DemoBlaze.simpleAlert();
	}
	@Test(priority=3)
	public void newMessage() {
		DemoBlaze.driver.findElement(By.xpath("//a[text()='Contact']")).click();
		//Access the inputsetup method from DemoBlaze
		DemoBlaze.inputsetup();
		DemoBlaze.waitfun();
		DemoBlaze.driver.findElement(By.xpath("//*[text()='Send message']")).click();
		DemoBlaze.simpleAlert();
	}
}
