package JavaPlaywright.JvPw;

import org.testng.annotations.*;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.sun.tools.sjavac.Log;

public class Testng123 {
	Playwright playwright;
	Browser browser;
	Page page;
	@BeforeMethod
	public void openBrowser() {
		playwright = Playwright.create(); 
		       browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      //BrowserContext context = browser.newContext();
		      page = browser.newPage();
		      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		      String title = page.title();
				
				System.out.println(" Title of Page "+title);
				
				String url = page.url();
				System.out.println("Page Url "+url);
		
	}

	@Test
	public void orangeHRMLogin() {
		
		page.getByPlaceholder("Username").click();
	      page.getByPlaceholder("Username").fill("admin");
	      page.getByPlaceholder("Password").click();
	      page.getByPlaceholder("Password").fill("admin123");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	}
	
	
}
