package POM;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import Base.MainBaseOrangeHRM;

public class LoginPOM extends MainBaseOrangeHRM {

	
	
	
//	page.getByPlaceholder("Username").click();
//    page.getByPlaceholder("Username").fill("admin");
//    page.getByPlaceholder("Password").click();
//    page.getByPlaceholder("Password").fill("admin123");
//    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	
	
	//private final Page page;
	  private final Locator searchTermInput;
	  private final Locator userName;
	  private final Locator password;
	  private final Locator loginBtn;
	  
	  
	  public LoginPOM() {
	   // this.page = page;
	    this.searchTermInput = page.locator("[aria-label='Enter your search term']");
	    this.userName = page.getByPlaceholder("Username");
	    this.password = page.getByPlaceholder("Password");
	    this.loginBtn = page.locator("//button[@type='submit']");
	    
	  }
	
	 public void login() {
		 userName.fill("admin");
		 password.fill("admin123");
		 loginBtn.click();
		 
	 }
	
}
