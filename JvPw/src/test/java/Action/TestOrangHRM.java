package Action;

import org.testng.annotations.*;

import Base.MainBaseOrangeHRM;
import POM.LoginPOM;

public class TestOrangHRM extends MainBaseOrangeHRM{
LoginPOM lpPOM;
	
	@BeforeMethod
	public void OpenBrowser() {
		initializing();
		 lpPOM = new LoginPOM();
		 
	}
	
	@Test
	public void Login() {
		lpPOM.login();
	}
	
	@AfterMethod
	public void closeBrowser() {
		closeBrowser();
	}
}
