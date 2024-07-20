package learning_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_2 {

	@Test(priority = 1)
	public void register() {
		//System.out.println("registeration successful");
		Reporter.log("registeration successful",true);
	}

	@Test(priority = 2)
	public void login() {
		//System.out.println("login completed");
		Reporter.log("login completed",true);
	}

	@Test(priority = 3)
	public void logout() {
		//System.out.println("logout completed");
		Reporter.log("logout completed",true);
	}

}
