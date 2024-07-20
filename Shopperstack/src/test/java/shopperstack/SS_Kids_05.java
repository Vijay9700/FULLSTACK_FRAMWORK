package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SS_Kids_05 {
	
	@Test(groups = "smoke")
	public void kids()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//click on login button
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("leodas@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Leodas@123");
		driver.findElement(By.id("Login")).click();
		//KIDS-->add first product to cart
		driver.findElement(By.id("kids")).click();
		driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		Reporter.log("KIDS-->PRODUCT ADDED SUCCESSFULLY",true);
		driver.quit();
	}

}
