package JavaPlaywright.JvPw;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class JavaPWBroswerContext {

	
	public static void main(String[] args) {
		
		 Playwright playwright = Playwright.create();
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = browser.newPage();
		      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		      page.getByPlaceholder("Username").click();
		      page.getByPlaceholder("Username").fill("admin");
		      page.getByPlaceholder("Password").click();
		      page.getByPlaceholder("Password").fill("admin123");
		      page.locator("//button[@type='submit']").click();
		    
		      context.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));
		      
		      
		      playwright.close();
		      
		    }
		
	}
	

