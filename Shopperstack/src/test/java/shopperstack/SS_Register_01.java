package shopperstack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utilities.PropertiesUtility;

public class SS_Register_01 {
	
	@Test(groups = "important")
	public void register() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		//driver.get("https://www.shoppersstack.com/");
		
		//read the data from properties
		PropertiesUtility p=new PropertiesUtility();
		driver.get(p.readProperty("url"));
		
		//click on login button
		driver.findElement(By.id("loginBtn")).click();
		//click on create account button
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("First Name")).sendKeys("John");
		driver.findElement(By.id("Last Name")).sendKeys("cena");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("9787879797");
		driver.findElement(By.id("Email Address")).sendKeys("johncena@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Johncena@123");
		driver.findElement(By.id("Confirm Password")).sendKeys("Johncena@123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
		Reporter.log("Registeration successful",true);
		driver.quit();
		}
}
