package shopperstack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_pages.LoginPage;
import pom_pages.WelcomePage;
import utilities.ExcelUtility;
import utilities.PropertiesUtility;

public class SS_Login_02 {

	@Test(groups = "smoke")
	public void login() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		
		//driver.get("https://www.shoppersstack.com/");
		PropertiesUtility p=new PropertiesUtility();
		driver.get(p.readProperty("url"));
		
		//pom class
		WelcomePage w=new WelcomePage(driver);
		LoginPage l=new LoginPage(driver);
		
		//click on login button
		w.getLoginButton().click();
		//read data from excel for login data
		ExcelUtility e=new ExcelUtility();
		
		l.getEmailTextField().
				sendKeys(e.readExcel("login", 1, 0));
		l.getPasswordTextField().
				sendKeys(e.readExcel("login", 1, 1));
		
		l.getLoginButton().click();
		Reporter.log("Login successful",true);
		driver.quit();
	}
}
