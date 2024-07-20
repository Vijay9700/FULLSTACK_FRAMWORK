package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//step 1-->create class as same as webpage name
public class WelcomePage {
	//step 2-->create parameterized constructor
	public WelcomePage(WebDriver driver)
	{
		//step 4-->initialize the webelement
		PageFactory.initElements(driver, this);
	}

	//step 3-->identify webelement and encapsulate
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(id="women")
	private WebElement womenLink;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}
}
