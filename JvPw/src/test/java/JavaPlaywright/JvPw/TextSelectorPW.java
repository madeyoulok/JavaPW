package JavaPlaywright.JvPw;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;


public class TextSelectorPW {
	public static void main(String[] args) throws InterruptedException {

	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = browser.newPage();
	      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      String title = page.title();
			
			System.out.println(" Title of Page "+title);
			
			String url = page.url();
			System.out.println("Page Url "+url);
	      page.getByPlaceholder("Username").click();
	      page.getByPlaceholder("Username").fill("admin");
	      page.getByPlaceholder("Password").click();
	      page.getByPlaceholder("Password").fill("admin123");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	      Locator links = page.locator("Timesheets");
	      for(int i =0; i<links.count(); i++) {
	    	  System.out.println(links.nth(i).textContent());
	      
	    }
	      
	    }}
	      
}
