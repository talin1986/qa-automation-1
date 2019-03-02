package firstTimeQaAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.Test;


public class IntegrationTest2 {

	@Test
	public void IntegrationTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//open the game on chrome web 
		
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);
		
		//try the "webhost" button
		
		driver.findElement(By.xpath("/html/body/div[2]/a/img")).click();
		driver.close();

	}

}
