package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SS_Men_03 {
	
	@Test(groups = "end")
	public void men()
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
		//men-->add first product to cart
		driver.findElement(By.id("men")).click();
		driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		Reporter.log("MEN-->PRODUCT ADDED SUCCESSFULLY",true);
		driver.quit();
	}

}
