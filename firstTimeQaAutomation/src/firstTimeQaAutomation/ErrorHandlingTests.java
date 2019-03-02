package firstTimeQaAutomation;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Suite.class)
@SuiteClasses({})
public class ErrorHandlingTests {



	@Test
	public void errorHandlingTest1() throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		try {

			driver.get("https://svcollegetest.000webhostapp.com/");

			Thread.sleep(1500);


			driver.findElement(By.id("startB")).click();
			// the first question 

			//trying to tackle the app with hebrew language

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("рсту");

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		}finally {

			driver.close();

		}
	}


	@Test
	public void errorHandlingTest2() throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {

			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// the first question 

			//trying to tackle the app with nums 

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		}finally {      
			driver.close();
		}

	}



	@Test
	public void errorHandlingTest3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		try		{					
			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// the first question 

			//trying to tackle the app with chars 

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("%$#@");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		}finally {
			driver.close();
		}
	}

	@Test
	public void errorHandlingTest4() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		try		{



			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// the first 4 Answers

			//trying to tackle the app with clicking next witout fill anything  

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
			jse1.executeScript("window.scrollBy(0,250)", "");

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		}finally {
			driver.close();
		}
	}
	@Test
	public void errorHandlingTest5() throws InterruptedException {

		//////////this is a bug ////////// this is a bug ////////// this is a bug /////////// this is a bug 


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		try {
			driver.get("https://svcollegetest.000webhostapp.com/");
			Thread.sleep(1500);

			driver.findElement(By.id("startB")).click();
			// the first 4 Answers

			//trying to tackle the app with clicking hebrew on the 4 fields  

			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

			JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
			jse1.executeScript("window.scrollBy(0,250)", "");


			// four answers 
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("р");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("с");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("т");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("у");
			driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

			driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		}finally {
			driver.close();
	   }
	}
	@Test
	public void errorHandlingTest6() throws InterruptedException {
//////////this is a bug ////////// this is a bug ////////// this is a bug /////////// this is a bug 


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		//trying to tackle the app with clicking nums on the 4 fields  

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("2");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("3");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("4");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}

	}
	@Test
	public void errorHandlingTest7() throws InterruptedException {
//////////this is a bug ////////// this is a bug ////////// this is a bug /////////// this is a bug 


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		//trying to tackle the app with clicking chars on the 4 fields  

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("&");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("@");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("$$");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("!!!");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}

	}
	@Test
	public void errorHandlingTest8() throws InterruptedException {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first question 

		//trying to tackle the app with 51 CHARS 

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	}
	@Test
	public void errorHandlingTest9() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		//trying to tackle the app with clicking 51 chars on the 4 fields  

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}

	}
	@Test
	public void errorHandlingTest10() throws InterruptedException {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

	 

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
		//trying to tackle the app  on second question with hebrew language
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("рсту");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
		
	}
	@Test
	public void errorHandlingTest11() throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
		//trying to tackle the app  on second question with numbers 
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
		
		
	}
	@Test
	public void errorHandlingTest12() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		//trying to tackle the app with clicking hebrew on the 4 fields  

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
		//trying to tackle the app  on second question with chars 
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	
	}
	@Test
	public void errorHandlingTest13() throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

	

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
		//trying to tackle the app  on second question with 51 CHARS
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
		
		
	}
	@Test
	public void errorHandlingTest14() throws InterruptedException {

		/// this is a bug /// this is a bug /////// this is a bug /// this is a bug /////// this is a bug /// this is a bug ////


				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
try {

				driver.get("https://svcollegetest.000webhostapp.com/");
				Thread.sleep(1500);

				driver.findElement(By.id("startB")).click();
				// the first 4 Answers

			

				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
				jse1.executeScript("window.scrollBy(0,250)", "");
				
				
				// four answers 
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

				

				Thread.sleep(1500);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.id("nextquest")).click();
				
				//trying to tackle the app on second 4 answers with hebrew language
				
				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				

				// second four answers
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("р");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("с");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("т");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("у");
				
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
				Thread.sleep(1500);
			    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
			
	}
	@Test
	public void errorHandlingTest15() throws InterruptedException {

		/// this is a bug /// this is a bug /////// this is a bug /// this is a bug /////// this is a bug /// this is a bug ////


				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();

try {
				driver.get("https://svcollegetest.000webhostapp.com/");
				Thread.sleep(1500);

				driver.findElement(By.id("startB")).click();
				// the first 4 Answers

				

				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
				jse1.executeScript("window.scrollBy(0,250)", "");
				
				
				// four answers 
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

				

				Thread.sleep(1500);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.id("nextquest")).click();
				
				//trying to tackle the app on second 4 answers with numbers
				
				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				

				//four answers
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("2");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("3");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("4");
				
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
				Thread.sleep(1500);
			    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	}
	@Test
	public void errorHandlingTest16() throws InterruptedException {

		/// this is a bug /// this is a bug /////// this is a bug /// this is a bug /////// this is a bug /// this is a bug ////


				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
try {

				driver.get("https://svcollegetest.000webhostapp.com/");
				Thread.sleep(1500);

				driver.findElement(By.id("startB")).click();
				// the first 4 Answers

				

				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
				jse1.executeScript("window.scrollBy(0,250)", "");
				
				
				// four answers 
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
						driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

				

				Thread.sleep(1500);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.id("nextquest")).click();
				
				//trying to tackle the app on second 4 answers with chars
				
				driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
				

				//four answers
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("@");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("!");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("#");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("#");
				
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
				Thread.sleep(1500);
			    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
			
	}
	@Test
	public void errorHandlingTest17() throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
try {

		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// first four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
	
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		

		//four answers
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
		
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
	
   // third question 
		//trying to tackle the app on third question with hebrew language
	    
	    driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("рсту");
	    
	   Thread.sleep(1500);
	   
	   driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	   
	}
	@Test
	public void errorHandlingTest18() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// first four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
	
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		

		//four answers
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
		
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
	
   // third question 
		//trying to tackle the app on third question with numbers
	    
	    driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("1234");
	    
	   Thread.sleep(1500);
	   
	   driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	   
	}
	@Test
	public void errorHandlingTest19() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// first four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
	
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		

		//four answers
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
		
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
	
   // third question 
		//trying to tackle the app on third question with numbers
	    
	    driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("*&^%");
	    
	   Thread.sleep(1500);
	   
	   driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	   
	}
	@Test
	public void errorHandlingTest20() throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
try {
		driver.get("https://svcollegetest.000webhostapp.com/");
		Thread.sleep(1500);

		driver.findElement(By.id("startB")).click();
		// the first 4 Answers

		

		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//scroll down 
		jse1.executeScript("window.scrollBy(0,250)", "");
		
		
		// first four answers 
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
				driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();

		

		Thread.sleep(1500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("nextquest")).click();
		
	
		
		driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
		

		// SECOND four answers
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("D");
		
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).click();
		Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
	
   // third question 
		//trying to tackle the app on third question with 51 CHARS
	    
	    driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZA");
	    
	   Thread.sleep(1500);
	   
	   driver.findElement(By.xpath("//*[@id=\"nextquest\"]")).click();
}finally {
	driver.close();
}
	   
	}


}




