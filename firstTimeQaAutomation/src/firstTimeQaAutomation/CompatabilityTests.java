package firstTimeQaAutomation;

import java.sql.Driver;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@RunWith(Suite.class)
@SuiteClasses({})

public class CompatabilityTests {



	@Test
	public void compatabilityTest2() throws InterruptedException  {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\TAL\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {

			//open the game on Firefox  broswer  
			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// the first question 
			driver.findElement(By.name("question")).sendKeys("ABCD");
			driver.findElement(By.id("nextquest")).click();

			// four answers 
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

			Thread.sleep(1500);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(By.id("nextquest")).click();

			//second questions 

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("EFGH");
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			//four answers
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("E");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("F");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("G");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("H");

			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			// third question 

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("IJKL");

			Thread.sleep(1500);

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			//four answers 

			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("I");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("J");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("K");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("L");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			Thread.sleep(1500);

			driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();

			//the game will start 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();

			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			Thread.sleep(1000);


			driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			Thread.sleep(1000);


			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

			JavascriptExecutor jse2 = (JavascriptExecutor)driver;//scroll down 
			jse2.executeScript("window.scrollBy(0,250)", "");



			driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();//quit



		} finally {
			driver.close();
		}
	}



	@Test
	public void compatabilityTest3() throws InterruptedException  {



		System.setProperty("webdriver.ie.driver","C:\\Users\\TAL\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");


		WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		//open the game onInternet explorer  broswer  
try {

		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(4000);

		driver.findElement(By.id("startB")).click();
		// the first question 
		driver.findElement(By.name("question")).sendKeys("ABCD");
		driver.findElement(By.id("nextquest")).click();

		// four answers 
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();

		//second questions 

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("EFGH");
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		//four answers
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("E");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("F");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("G");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("H");

		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		// third question 

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("IJKL");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		//four answers 

		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("I");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("J");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("K");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("L");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();

		//the game will start 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();

		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();

		JavascriptExecutor jse2 = (JavascriptExecutor)driver;//scroll down 
		jse2.executeScript("window.scrollBy(0,250)", "");



		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();//quit
		driver.close();


	}
	finally {
		driver.close();
	
}
}


}