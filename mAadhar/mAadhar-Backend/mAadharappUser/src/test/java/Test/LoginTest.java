package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	String driverPath="C:\\Users\\Visalini S\\Downloads\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
  
    driver.manage().window().maximize();
	driver.get("http://localhost:4200/");
	
	driver.findElement(By.name("phone_num")).sendKeys("7339027909");
	
	driver.findElement(By.id("password")).sendKeys("pass");

	driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div[1]/form/div[3]/button")).click();

}
 @BeforeTest
  public void beforeTest() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Visalini S\\Downloads\\chromedriver.exe");
  	  driver = new ChromeDriver();
  }
  	 @AfterTest
  	  public void afterTest() {
  		 System.out.println("After test is running");
  	  }
}
