package firstTimeQaAutomation;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Suite.class)
@SuiteClasses({})
public class FunctionalityTests {


	@Test
	public void FuctionalityTest3() throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		try {
			//open the game on Chrome browser 

			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// Try the   button " BACK " of the first question  
			driver.findElement(By.xpath("//*[@id=\"backquest\"]")).click();
			Thread.sleep(2000);
		}finally {
			driver.close();
		}
	}
}	