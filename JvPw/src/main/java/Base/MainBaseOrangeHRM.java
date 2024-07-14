package Base;

import com.microsoft.playwright.*;


public class MainBaseOrangeHRM {
public Playwright playwright;
public Browser browser;
public static Page page;
	
	
	public void initializing() {
		
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
	public void closeBrowser() {
		browser.close();
		playwright.close();
		
	}
}
